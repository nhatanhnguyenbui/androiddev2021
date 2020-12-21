package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {
    public ForecastFragment() {

    }

    public static ForecastFragment newInstance() {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //LinearLayout ll = new LinearLayout(getContext());
        //ll.setOrientation(LinearLayout.VERTICAL);
        //View view = new View(getContext());
        //view.setBackgroundColor(Color.parseColor("#3b9ae8"));

        /*TextView textView = new TextView(getContext());
        textView.setText("Thursday");

        ImageView imageView = new ImageView(getContext());

        imageView.setImageResource(R.drawable.cloud);*/

        //LinearLayout layout = new LinearLayout(getContext());

        /*layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(textView);
        layout.addView(imageView);*/
        return inflater.inflate(R.layout.fragment_forecast, container, false);
        //return layout;
    }
}
