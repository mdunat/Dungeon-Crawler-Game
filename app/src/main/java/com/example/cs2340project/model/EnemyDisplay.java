package com.example.cs2340project.model;
import android.widget.ImageView;

public class EnemyDisplay {
    private ImageView enemySpriteImageView;

    public EnemyDisplay(ImageView playerSpriteImageView) {
        this.enemySpriteImageView = playerSpriteImageView;
    }
    public void enemyMoved(int x, int y, int row) {
        enemySpriteImageView.setX(x);
        enemySpriteImageView.setY(y);
        enemySpriteImageView.setElevation(row);
    }

}


