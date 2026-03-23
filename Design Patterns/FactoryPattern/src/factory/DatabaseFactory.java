package factory;

import query.Query;
import transactions.Transaction;

public interface DatabaseFactory {

     Query getQuery();

    Transaction createTransaction();

    // createUpdator() -> facotry Method
}
