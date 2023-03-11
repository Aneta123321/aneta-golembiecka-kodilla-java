package com.kodilla.stream.immutable;

public final class ForumUserI { //realizuje punkt 2 zadania
    private final String username; // pole jest prywatne punkt 3 i slowo final punkt 2, aby klasa byla niemutowalna=nie do zmiany
    private final String realName; //final - pisze po to, aby nie moc zmienic wartosci

    public ForumUserI(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
