package vn.aptech.project_k2_g1_c2206l.Model;

import vn.aptech.project_k2_g1_c2206l.Views.AccountType;
import vn.aptech.project_k2_g1_c2206l.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private AccountType accountType;

    private Model() {
        this.viewFactory = new ViewFactory();
    }

    public static synchronized Model getInstance() {
        if(model ==null) {
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
