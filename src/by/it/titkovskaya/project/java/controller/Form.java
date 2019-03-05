package by.it.titkovskaya.project.java.controller;

import javax.servlet.http.HttpServletRequest;

class Form {

    static boolean isPost(HttpServletRequest req) {
        return req.getMethod().equalsIgnoreCase("post");
    }
    static boolean isGet(HttpServletRequest req) {
        return req.getMethod().equalsIgnoreCase("get");
    }

    static String getString(HttpServletRequest req, String name) throws SiteException {
        return getString(req, name, ".*");
    }

    static String getString(HttpServletRequest req, String name, String pattern) throws SiteException {
        String value = req.getParameter(name);
        if (value.matches(pattern))
            return value;
        else
            throw new SiteException("Value " + value + " is incorrect");
    }

    static int getInt(HttpServletRequest req, String name) {
        String value = req.getParameter(name);
        return Integer.parseInt(value);
    }

    static double getDouble(HttpServletRequest req, String name) {
        String value = req.getParameter(name);
        return Double.parseDouble(value);
    }

    static long getLong(HttpServletRequest req, String name) {
        String value = req.getParameter(name);
        return Long.parseLong(value);
    }
}
