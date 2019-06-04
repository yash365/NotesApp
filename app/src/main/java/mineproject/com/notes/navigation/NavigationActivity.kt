package mineproject.com.notes.navigation

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_navigation.*
import mineproject.com.notes.R

class NavigationActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_notes -> {
                messageTextView.setText(R.string.title_notes)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_tasks -> {
                messageTextView.setText(R.string.title_tasks)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        messageTextView.text = getString(R.string.title_tasks)
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}
