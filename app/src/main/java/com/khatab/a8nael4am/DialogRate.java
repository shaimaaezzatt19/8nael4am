package com.khatab.a8nael4am;//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.widget.LinearLayout;
//import android.widget.RatingBar;
//import android.widget.TextView;
//
//import com.ipda3.newsofraapp.R;
//
//public class DialogRate extends Fragment implements RatingBar.OnRatingBarChangeListener {
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_add_comment);
//        LinearLayout ll_dialog = (LinearLayout) findViewById(R.id.DialogComment_Rainting);
//        final RatingBar rate_bar = new RatingBar(context);
//        rate_bar.setOnRatingBarChangeListener(this);
//        rate_bar.setStepSize((float) 0.5);
//        rate_bar.setMax(5);
//        rate_bar.setId(1);
//        rate_bar.setRating(2.0f); // Error occur on this line!
//        ll_dialog.addView(rate_bar);
//    }
//
//    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//        // TODO Auto-generated method stub
//        TextView rate_val = (TextView) findViewById(0);
//        rate_val.setText(Float.toString(ratingBar.getRating()));
//    }
//}
