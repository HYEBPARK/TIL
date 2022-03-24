package com.programmers.collection_0324.optional;

public class EmptyMain {
    public static void main(String[] args) {
        EmptyUser emptyUser = EmptyUser.EMPTY;
        EmptyUser user = getUser();
        if (user == EmptyUser.EMPTY) {

        }
    }

    private static EmptyUser getUser() {
        return EmptyUser.EMPTY;
    }
}
