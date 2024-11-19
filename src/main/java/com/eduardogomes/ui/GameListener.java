package com.eduardogomes.ui;

public interface GameListener {
    default void onGameStopped(){};
    default void onUpdateScore(){};
}
