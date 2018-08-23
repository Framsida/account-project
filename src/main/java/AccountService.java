import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private Map<Integer, Account> accountMap;

    public AccountService() {
        accountMap = new HashMap<Integer, Account>();
    }

    public int addAccountToMap(Account accountToAdd) {
        this.accountMap.put(this.accountMap.size()+1, accountToAdd);
        return this.accountMap.size();
    }

    public void getAccountById(int idOfAccount) {
        this.accountMap.get(idOfAccount);
    }
}
