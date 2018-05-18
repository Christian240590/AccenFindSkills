package com.accenture.accenfindskills

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.accenture.accenfindskills.adapters.UserListAdapter
import com.accenture.accenfindskills.dtos.UserDto

class MainActivity2: AppCompatActivity() {

    var listView: ListView? = null
    var adapter: UserListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        listView = findViewById<ListView>(R.id.listView)
        adapter = UserListAdapter(this, generateData())

        listView?.adapter = adapter
        adapter?.notifyDataSetChanged()

    }

    fun generateData(): ArrayList<UserDto> {
        var result = ArrayList<UserDto>()


        var user: UserDto = UserDto("Alejandro Miranda Suarez", "23 Year Old, Analist")
            result.add(user)

        var user1: UserDto = UserDto("Luis Sandoval Ortega", "28 Year Old, Trainee")
        result.add(user1)

        var user2: UserDto = UserDto("Javiera Salas Martinez", "21 Year Old, Analist")
        result.add(user2)

        var user3: UserDto = UserDto("Claudia Saavedra Toro", "23 Year Old, Specialist")
        result.add(user3)

        var user4: UserDto = UserDto("Juan Smith Letelier", "19 Year Old, Trainee")
        result.add(user4)

        var user5: UserDto = UserDto("César Bustos Contreras", "23 Year Old, Analist")
        result.add(user5)

        var user6: UserDto = UserDto("Camila Valdebenito Perez", "25 Year Old, Trainee")
        result.add(user6)

        var user7: UserDto = UserDto("Mauricio Ferreira Suarez", "23 Year Old, Trainee")
        result.add(user7)

        var user8: UserDto = UserDto("Fernanda Camillo Henriquez", "28 Year Old, Analist")
        result.add(user8)

        var user9: UserDto = UserDto("Johanthan Leon Gutierrez", "23 Year Old, Analist")
        result.add(user9)

        var user10: UserDto = UserDto("Mario Valdivia Herrera", "22 Year Old, Trainee")
        result.add(user10)

        var user11: UserDto = UserDto("Jorge Saez Suarez", "21 Year Old, Trainee")
        result.add(user11)


        return result
    }
}
