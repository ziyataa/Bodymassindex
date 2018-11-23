package com.ziyata.bodymassindex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Process
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 1 membuat respon ketika diclick
        //Membuat variabel berat badan


        btnHitung.onClick {
            var beratBadan = edtBeratBadan.text.toString()
            var tinggiBadan = edtTinggiBadan.text.toString()
            val kurus = 0.0
            val batasKurus = 18.4
            val normal = 18.5
            val batasNormal = 24.9
            val gemuk = 25.0
            val batasGemuk = 29.9

            if (beratBadan.toDoubleOrNull() != null && tinggiBadan.toDoubleOrNull() != null )//Kedua oprasi harus benar maka akan masuk ke proses dan dijalankann
            { //Kedua oprasi harus benar maka akan masuk ke proses dan dijalankann
                //Memasukkan rumus berat badan
                var process = beratBadan.toDouble()/(tinggiBadan.toDouble() * tinggiBadan.toDouble())
                when (process){
                    in kurus..batasKurus -> {
                        txtHasil.text = "Kamu Kurus :'( $process"
                        alert("Kamu Kurus"){
                            yesButton {
                            }
                        }.show()
                    }
                    in normal..batasNormal -> {
                        txtHasil.text = "Kamu Normal :) $process"
                        alert("Kamu Normal"){
                            yesButton {
                            }
                        }.show()
                    }
                    in gemuk..batasGemuk -> {
                        txtHasil.text =  "Kamu Gemuk Cantik $process"
                        alert("Kamu Gemuk"){
                            yesButton {
                            }
                        }.show()
                    }
                    else -> {
                        txtHasil.text = "Kamu Obesitas :( $process"
                        alert("Kamu Obesitas"){
                            yesButton {
                            }
                        }.show()
                    }

                }


            }else{
                //TODO menampilkan pop up ketika null

                //Toast.makeText(this,"Harap masukkan datanya !", Toast.LENGTH_SHORT).show()
                toast("Harap Masukan Datanya")

            }





        //tidak menggunakan anco
        /*
        btnHitung.setOnClickListener {
            var beratBadan = edtBeratBadan.text.toString()
            var tinggiBadan = edtTinggiBadan.text.toString()
            val kurus = 0.0
            val batasKurus = 18.4
            val normal = 18.5
            val batasNormal = 24.9
            val gemuk = 25.0
            val batasGemuk = 29.9

            if (beratBadan.toDoubleOrNull() != null && tinggiBadan.toDoubleOrNull() != null )//Kedua oprasi harus benar maka akan masuk ke proses dan dijalankann
            { //Kedua oprasi harus benar maka akan masuk ke proses dan dijalankann
                //Memasukkan rumus berat badan
                var process = beratBadan.toDouble()/(tinggiBadan.toDouble() * tinggiBadan.toDouble())
                when (process){
                    in kurus..batasKurus -> {
                        txtHasil.text = "Kamu Kurus :'( $process"
                    }
                    in normal..batasNormal -> {
                        txtHasil.text = "Kamu Normal :) $process"
                    }
                    in gemuk..batasGemuk -> {
                        txtHasil.text =  "Kamu Gemuk Cantik $process"
                    }
                    else -> {
                        txtHasil.text = "Kamu Obesitas :( $process"
                    }

                }


            }else{
                //TODO menampilkan pop up ketika null

                Toast.makeText(this,"Harap masukkan datanya !", Toast.LENGTH_SHORT).show()

            }
*/



        }

    }
}
