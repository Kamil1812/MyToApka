package com.example.mytoapka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = 0;

        findViewById<Button>(R.id.btn2).setOnClickListener {
            if (x<4) {
                x += 1;

                if (x == 1)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.gigachad)
                }

                if (x == 2)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.gigachad2)
                }

                if (x == 3)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.gigachad3)
                }

                if (x == 4)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.gigachad4)
                }
            }
            else {
                x = 4;
            }
        }

        findViewById<Button>(R.id.btn1).setOnClickListener {
            if (x != 0) {
                x -= 1;

                if (x == 1)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.gigachad)
                }

                if (x == 2)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.gigachad2)
                }

                if (x == 3)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.gigachad3)
                }

                if (x == 4)
                {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.gigachad4)
                }
            }
            else {
                x = 0;
            }
        }
    }
}