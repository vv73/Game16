package ru.samsung.itschool.game18;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by vv on 22.11.2016.
 */
public abstract class Figure{
    Vector pos;
    Vector velocity;
    Paint paint;

    Figure(float posX, float posY) {
        pos = new Vector(posX, posY);
        paint = new Paint();
        velocity = new Vector(0, 0.1f);
    }

    abstract void draw(Canvas canvas);

    void move() {
        pos.sum(velocity);
    }

}
