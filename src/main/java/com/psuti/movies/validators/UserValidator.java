//package com.psuti.movies.validators;
//
//import com.psuti.movies.models.User;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//@Component("beforeCreateUserValidator")
//public class UserValidator implements Validator {
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return User.class.equals(aClass);
//    }
//
//    @Override
//    public void validate(Object o, Errors errors) {
//        User user = (User) o;
//        if (checkEmptyString(user.getFirstName()))
//            errors.rejectValue("firstName", "empty");
//
//        if (checkEmptyString(user.getLastName()))
//            errors.rejectValue("firstName", "empty");
//
//        if (checkEmptyString(user.getMail()))
//            errors.rejectValue("firstName", "empty");
//    }
//
//    private boolean checkEmptyString(String str) {
//        return (str == null || str.trim().length() == 0);
//    }
//}
