package chouray.com.practicekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, getVersionName(), Toast.LENGTH_SHORT).show()
    }

    private fun getVersionName() : String {
        return packageManager.getPackageInfo(packageName, 0).versionName;
    }
}
