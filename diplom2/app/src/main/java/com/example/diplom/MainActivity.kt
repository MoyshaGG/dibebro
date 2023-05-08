package com.example.diplom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.room.Room
import com.example.diplom.model.CPU
import com.example.diplom.model.GPU
import com.example.diplom.model.Motherboard
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val stringBuilder = StringBuilder()
        db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "my-db").build()
        CoroutineScope(Dispatchers.IO).launch {
//            db.gpuDao().insert(GPU(21, "John" , "Lenonn", 1,"2","2","2","2",2,"2"))
//            val gpuList = db.gpuDao().getAllGpu()

//            for (gpu in gpuList) {
//                stringBuilder.append("Name: ${gpu.gpuName}, Email: ${gpu.gpuBrand}\n")
//            }
//            val gpuText = stringBuilder.toString()
//            val gpuTextView = findViewById<TextView>(R.id.TextView)
//            gpuTextView.text = gpuText


          //  db.motherboardDao().insert()
//            val motherlist = db.motherboardDao().getAllMotherboard()
//            for (motherboard in motherlist) {
//                stringBuilder.append("Motherboard: ${motherboard.motherboardName}, id: ${motherboard.id}\n")
//            }
//            val motherText = stringBuilder.toString()
//            val MotherTextView = findViewById<TextView>(R.id.TextView2)
//            MotherTextView.text = motherText
//            db.cpuDao().insert(
//                CPU(0,"Boba","Nvidia","231",
//                23,2,"2",2,2,"23",
//                2313,"m",2)
//            )
//            val cpuList = db.cpuDao().getAllCpu()
//            val stringBuild = StringBuilder()
//            for (cpu in cpuList) {
//                stringBuilder.append("Name: ${cpu.cpuBrand}, Email: ${cpu.cpuCores}\n")
//            }
//            val cpuText = stringBuilder.toString()
            // val cpuTextView = findViewById<TextView>(R.id.TextView2)
            //   cpuTextView.text = cpuText
        }

    }
}