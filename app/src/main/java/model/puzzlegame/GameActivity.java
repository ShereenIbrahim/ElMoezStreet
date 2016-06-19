package model.puzzlegame;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.sh.elmoezstreet.R;

import fragments.StoryFragment;

public class GameActivity extends Activity {
    /** Called when the activity is first created. */

    String activityName="";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();

        activityName=extras.getString("activity_name");
        if(activityName.equals("Al-Hakim bi-Amr Allah Mosque")){

            setContentView(R.layout.game_play_activity);

        }
       else if(activityName.equals("Aqmar Mosque")){

            setContentView(R.layout.game_play_activity);

        }


        Button play=(Button) findViewById(R.id.PlayButton);
        play.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Game.class);
                startActivity(intent);
            }
        });

        Button skip=(Button) findViewById(R.id.skip);
        skip.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WinGame.class);
                intent.putExtra("activity_name",activityName);

                startActivity(intent);

            }
        });
        
    }

}