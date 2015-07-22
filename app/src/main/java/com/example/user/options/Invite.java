package com.example.user.options;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by User on 7/5/2015.
 */
public class Invite extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invite);

        Button inviteSave = (Button)findViewById(R.id.btnInviteSave);
        inviteSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Invite.this, "Your work has been Saved", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
