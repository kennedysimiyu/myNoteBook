package simiyu.kennedy.mynotebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_note);

        /** get the intent that started the activity and extract the string **/
        Intent intent = getIntent();
        String message = intent.getStringExtra(NoteActivity.EXTRA_NOTE);

        /** capture the layouts text view and set the string as text **/
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
