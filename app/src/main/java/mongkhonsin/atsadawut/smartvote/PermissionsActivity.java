package mongkhonsin.atsadawut.smartvote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PermissionsActivity extends AppCompatActivity {
    private Button permissionsButton;
    private EditText editTextId;
    private String id;
    //private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permissions);

       // intent = getIntent();
        permissionsButton = findViewById(R.id.permissions_button);
        editTextId = findViewById(R.id.edit_text_id);
        id = editTextId.getText().toString();
        permissionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}