package com.android_academy.startfromscratch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android_academy.startfromscratch.solution_1.MovieActivity
import com.android_academy.startfromscratch.solution_5.MainActivity
import kotlinx.android.synthetic.main.activity_start.*

class StarterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        solution_button1.setOnClickListener {
            startSolution1()
        }

        solution_button2.setOnClickListener {
            startSolution2()
        }

        solution_button3.setOnClickListener {
            startSolution3()
        }

        solution_button4.setOnClickListener {
            startSolution4()
        }

        solution_button5.setOnClickListener {
            startSolution5()
        }

        exercise_button_1.setOnClickListener {
            startExercise1()
        }

        exercise_button_2.setOnClickListener {
            startExercise2()
        }


        exercise_button_3.setOnClickListener {
            startExercise3()
        }


        exercise_button_4.setOnClickListener {
            startExercise4()
        }


        exercise_button_5.setOnClickListener {
            startExercise5()
        }

    }

    private fun startExercise5() {
        startActivity(Intent(this, com.android_academy.startfromscratch.exercise_5.MainActivity::class.java))
    }

    private fun startExercise4() {
        startActivity(Intent(this, com.android_academy.startfromscratch.exercise_4.MainActivity::class.java))
    }

    private fun startExercise3() {
        startActivity(Intent(this, com.android_academy.startfromscratch.exercise_3.MainActivity::class.java))
    }

    private fun startExercise2() {
        startActivity(Intent(this, com.android_academy.startfromscratch.exercise_2.MainActivity::class.java))
    }

    private fun startExercise1() {
        startActivity(Intent(this, com.android_academy.startfromscratch.exercise_1.MainActivity::class.java))
    }

    private fun startSolution5() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun startSolution4() {
        startActivity(Intent(this, com.android_academy.startfromscratch.solution_4.MainActivity::class.java))
    }

    private fun startSolution3() {
        startActivity(Intent(this, com.android_academy.startfromscratch.solution_3.MainActivity::class.java))
    }

    private fun startSolution2() {
        startActivity(Intent(this, com.android_academy.startfromscratch.solution_2.MainActivity::class.java))
    }

    private fun startSolution1() {
        startActivity(Intent(this, com.android_academy.startfromscratch.solution_1.MainActivity::class.java))
    }
}