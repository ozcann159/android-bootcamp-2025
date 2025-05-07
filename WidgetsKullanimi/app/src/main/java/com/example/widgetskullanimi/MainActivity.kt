import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.widgetskullanimi.databinding.ActivityMainBinding
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->
            if (isChecked) {
                val secilenButton = findViewById<MaterialButton>(checkedId)
                val buttonYazi = secilenButton.text.toString()
                Log.e("Widgets", buttonYazi)
                Toast.makeText(this, buttonYazi, Toast.LENGTH_SHORT).show()
            }
        }

        val ulkeler = ArrayList<String>()
        ulkeler.add("Türkiye")
        ulkeler.add("İtalya")
        ulkeler.add("Japonya")

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, ulkeler)
        binding.autoCompleteTextView.setAdapter( arrayAdapter)


    }
}
