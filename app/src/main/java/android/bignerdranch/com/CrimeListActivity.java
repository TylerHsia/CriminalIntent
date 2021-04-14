package android.bignerdranch.com;

import androidx.fragment.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity{
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
