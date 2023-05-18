import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.netclanclone.ui.explore.Fragment1
import com.example.netclanclone.ui.explore.Fragment2
import com.example.netclanclone.ui.explore.Fragment3

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        // return a different fragment for each tab based on its position
        return when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            else -> throw IllegalArgumentException("Invalid tab position")
        }
    }

    override fun getCount(): Int {
        // return the number of tabs in the layout
        return 3
    }


}
