package by.it.titkovskaya.project.java;

import by.it.titkovskaya.project.beans.Account;
import by.it.titkovskaya.project.custom_DAO.Dao;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class CmdIndex implements Cmd {

    @Override
    public Action execute(HttpServletRequest req) throws Exception{
        List<Account> accounts = Dao.getDao().account.getAll();
        req.setAttribute("accounts", accounts);
        return Action.INDEX;
    }
}