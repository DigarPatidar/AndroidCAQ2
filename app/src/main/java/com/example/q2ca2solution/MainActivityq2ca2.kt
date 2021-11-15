package com.example.q2ca2solution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.qu2ca2)

        val Name=findViewById<EditText>(R.id.edtxt1)
        val subject=findViewById<EditText>(R.id.edtxt2)
        val lsn=findViewById<EditText>(R.id.edtxt3)
        val rdGrp=findViewById<RadioGroup>(R.id.rdgrp)
        val ch1=findViewById<CheckBox>(R.id.chkbx1)
        val ch2=findViewById<CheckBox>(R.id.chkbx2)
        val ch3=findViewById<CheckBox>(R.id.chkbx3)
        val ch4=findViewById<CheckBox>(R.id.chkbx4)
        val submitbutton=findViewById<Button>(R.id.sbtbutton)

        submitbutton.setOnClickListener{
            val selectedOperationInRadioGroup = rdGrp.checkedRadioButtonId
            var resultfed = ""
            val isch1 = ch1.isChecked
            val isch2 = ch2.isChecked
            val isch3 = ch3.isChecked
            val isch4 = ch4.isChecked
            if(isch1)
            {
                resultfed += "1. I really enjoy this lesson. , "
            }
            if(isch2)
            {
                resultfed += "2. I would like to know more deep in this lesson. , "
            }
            if(isch3)
            {
                resultfed += "3. I am satisfied with content and full description. , "
            }
            if(isch4)
            {
                resultfed += "4. I will prefer this lesson to else also."
            }

            if (Name.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
             else if (subject.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Please enter subject", Toast.LENGTH_SHORT).show()
            }
            else if (Name.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Please enter chapter name", Toast.LENGTH_SHORT).show()
            }
            else if(selectedOperationInRadioGroup == -1)
            {
                Toast.makeText(applicationContext,"Please select level of understanding lesson.", Toast.LENGTH_SHORT).show()
            }
            else if(resultfed.length == 0)
            {
                Toast.makeText(applicationContext,"Please select atleast one ", Toast.LENGTH_SHORT).show()
            }
            else if(selectedOperationInRadioGroup != -1 && resultfed.length != 0)
            {
                val radioButton = findViewById<RadioButton>(selectedOperationInRadioGroup)
                val name = Name.text.toString()
                val sub=subject.text.toString()
                val chap=lsn.text.toString()
                Toast.makeText(applicationContext,"Your name: $name\n Your Subject: $sub\nChapter name: $chap\nYou select:  ${radioButton.text} \n\n Some suggestions is/are \n\n $resultfed", Toast.LENGTH_LONG).show()
            }

        }
    }
}