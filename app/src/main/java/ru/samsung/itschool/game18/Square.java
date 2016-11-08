package ru.samsung.itschool.game18;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Square {
    Vector pos;
    Vector velocity;
    Paint paint;

    // Square(Vector pos)
    // Square(Vector pos, Vector velocity)
    Square(float posX, float posY) {
        pos = new Vector(posX, posY);
        paint = new Paint();
        velocity = new Vector(0.1f, 0.1f);
    }

    void draw(Canvas canvas) {
        canvas.drawRect(pos.x, pos.y, pos.x + 50, pos.y + 50, paint);
    }

    void move() {
        pos.sum(velocity);
    }

}
