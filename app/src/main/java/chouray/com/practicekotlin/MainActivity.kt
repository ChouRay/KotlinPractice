package chouray.com.practicekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val BASE_URL = BuildConfig.BASE_URL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvVersionName = findViewById<TextView>(R.id.id_tv_versionname)
        tvVersionName.setText("VersionName: " +getVersionName() + "\nVersionCode: " + getVersionCode()
                + "\nurl: " + BASE_URL)

    }

    private fun getVersionName() : String {
        return packageManager.getPackageInfo(packageName, 0).versionName;
    }
    private fun getVersionCode() : Int {
        return packageManager.getPackageInfo(packageName, 0).versionCode;
    }
}
