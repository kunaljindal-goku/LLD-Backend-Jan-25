package com.example.splitwiseJan.service;

import com.example.splitwiseJan.dto.response.Transaction;
import com.example.splitwiseJan.models.Expense;
import com.example.splitwiseJan.models.Group;
import com.example.splitwiseJan.repository.GroupRepository;
import com.example.splitwiseJan.strategy.HeapSettleUpStrategy;
import com.example.splitwiseJan.strategy.SettleUpStrategy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SettleUpService {

    private GroupRepository groupRepository;
    private SettleUpStrategy settleUpStrategy;

    public SettleUpService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
        this.settleUpStrategy = new HeapSettleUpStrategy();
    }

    public List<Transaction> settleUpGroup(long groupId) {

        Optional<Group> groupOptional = groupRepository.findById(groupId);
        if(groupOptional.isEmpty()) {
            throw new RuntimeException("Invalid groupId: "+groupId);
        }

        Group currGroup = groupOptional.get();
        List<Expense> expenses = currGroup.getExpenses();
        return settleUpStrategy.settleUp(expenses);
    }
}
