package com.example.st10458190ass2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val SleepImage = findViewById<ImageView>(R.id.SleepImage)
        val FeedButton = findViewById<Button>(R.id.FeedButton)
        val BathButton = findViewById<Button>(R.id.BathButton)
        val PlayButton = findViewById<Button>(R.id.PlayButton)
        val SleepButton = findViewById<Button>(R.id.PlayButton)

        val SleepingText = findViewById<TextView>(R.id.SleepingText)

        // Retrieve the message passed from the first screen
        val feedTextView = findViewById<TextView>(R.id.FeedTextView)
        // Set the text of the feed TextView to the feed message
        feedTextView.text = "FeedMessage"

        //Logic for the Feed Button
        FeedButton.setOnClickListener {
            // Change  the pet's image to match the feeding action icon
            SleepImage.setImageResource(R.drawable.giphy)
            //Update the feedTextview
            feedTextView.text = "Thank You.. can we play?"
            SleepingText.text = "Eating.."

            // Logic for the PlayButton
            PlayButton.setOnClickListener {
                // change the pet's image to match the play action icon
                SleepImage.setImageResource(R.drawable._5a5c44d26f0cb79074e18e6dff8c2d2)
                // Update the feedTextView
                feedTextView.text="Thank you!,Im dirty"
                SleepingText.text = "Playing.."

                // Logic for the BathButton
                BathButton.setOnClickListener {
                    // change the pet's image to match the batch action icon
                    SleepImage.setImageResource(R.drawable.depositphotos_42285267_stock_illustration_cat_having_a_bath)
                    // Update the feedTextView
                    feedTextView.text= "Thank You,Im clean,i want to rest"
                    SleepingText.text = "Bathing..."



                    class activity_second_page : AppCompatActivity() {
                        private lateinit var feedProgressBar: ProgressBar
                        private lateinit var playProgressBar: ProgressBar
                        private lateinit var cleanProgressBar: ProgressBar

                        private var feedProgressStatus:Int = 0
                        private var playProgressStatus:Int = 0
                        private var cleanProgressStatus:Int = 0

                        override fun onCreate( savedInstanceState:Bundle?) {
                            super.onCreate(savedInstanceState)
                            setContentView(R.layout.activity_second_page)

                            feedProgressBar =findViewById(R.id.FeedProgressbar)
                            playProgressBar = findViewById(R.id.PlayProgressBar)
                            cleanProgressBar = findViewById(R.id.BathProgressBar)

                            val FeedButton = findViewById<Button>(R.id.FeedButton)
                            val BathButton = findViewById<Button>(R.id.BathButton)
                            val PlayButton = findViewById<Button>(R.id.PlayButton)

                            FeedButton.setOnClickListener{
                                feedProgressStatus= 0
                                feedProgressBar.progress = feedProgressStatus
                                Thread(Runnable {
                                    while (feedProgressStatus < 100) {
                                        feedProgressStatus += 5
                                        Thread.sleep(1000)
                                        runOnUiThread {
                                            feedProgressBar.progress = feedProgressStatus
                                        }
                                    }
                                    runOnUiThread {
                                    }
                                }).start()
                            }
                            BathButton.setOnClickListener {
                                cleanProgressStatus = 0
                                cleanProgressBar.progress = cleanProgressStatus
                                Thread(Runnable {
                                    while (cleanProgressStatus < 100) {
                                        cleanProgressStatus += 5
                                        Thread.sleep(1000)
                                        runOnUiThread {
                                            cleanProgressBar.progress =
                                                cleanProgressStatus
                                        }
                                    }
                                    runOnUiThread {
                                    }
                                }).start()
                            }
                            PlayButton.setOnClickListener {
                                playProgressStatus = 0
                                playProgressBar.progress = playProgressStatus
                                Thread(kotlinx.coroutines.Runnable {
                                    while (playProgressStatus<100) {
                                        playProgressStatus += 5
                                        Thread.sleep(1000)
                                        runOnUiThread {
                                            playProgressBar.progress = playProgressStatus
                                        }
                                    }
                                    runOnUiThread {
                                    }
                                }).start()

                            }
                        }

                    }












                }




            }

        }
}}