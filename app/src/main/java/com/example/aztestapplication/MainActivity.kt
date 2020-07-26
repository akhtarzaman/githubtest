package com.example.aztestapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

/* import android.support.v7.app.AppCompatActivity; */   class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //final ListView list = findViewById(R.id.list);
        val arrayList = ArrayList<SubjectData>()
        arrayList.add(SubjectData("JAVA", "https://www.tutorialspoint.com/java/", "https://www.tutorialspoint.com/java/images/java-mini-logo.jpg"))
        arrayList.add(SubjectData("Python", "https://www.tutorialspoint.com/python/", "https://www.tutorialspoint.com/python/images/python-mini.jpg"))
        arrayList.add(SubjectData("Javascript", "https://www.tutorialspoint.com/javascript/", "https://www.tutorialspoint.com/javascript/images/javascript-mini-logo.jpg"))
        arrayList.add(SubjectData("Cprogramming", "https://www.tutorialspoint.com/cprogramming/", "https://www.tutorialspoint.com/cprogramming/images/c-mini-logo.jpg"))
        arrayList.add(SubjectData("Cplusplus", "https://www.tutorialspoint.com/cplusplus/", "https://www.tutorialspoint.com/cplusplus/images/cpp-mini-logo.jpg"))
        arrayList.add(SubjectData("Android", "https://www.tutorialspoint.com/android/", "https://www.tutorialspoint.com/android/images/android-mini-logo.jpg"))
        //   CustomAdapter customAdapter = new CustomAdapter(this, arrayList);
        //   list.setAdapter(customAdapter);
    }
}