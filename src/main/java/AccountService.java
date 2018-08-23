import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private Map<Integer, Account> accountMap;
    private int counter = 1;

    public AccountService() {
        accountMap = new HashMap<Integer, Account>();
    }

    public int addAccountToMap(Account accountToAdd) {
        this.accountMap.put(counter, accountToAdd);
        return counter++;
    }

    public void getAccountById(int idOfAccount) {
        this.accountMap.get(idOfAccount);
    }
}
