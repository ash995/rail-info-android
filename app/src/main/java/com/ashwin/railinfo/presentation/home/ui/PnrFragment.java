package com.ashwin.railinfo.presentation.home.ui;


import android.support.v4.app.Fragment;

/**
 * Created by ashwin on 12/3/18.
 */

public class PnrFragment extends Fragment {

    public static PnrFragment INSTANCE;

    public static PnrFragment getInstance() {
        if (INSTANCE == null) {
            return new PnrFragment();
        }
        else {
            return INSTANCE;
        }
    }
}
