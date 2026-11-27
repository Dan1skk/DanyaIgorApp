package com.example.danyaigorapp.data.network


import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupaBase {
    val supabase = createSupabaseClient(
        supabaseUrl = "https://grbncnpxuzhemcjlxzqp.supabase.co",
        supabaseKey = "sb_publishable_bGpya7nEWVXLcpgKUJfhhg_4fWgseG1"
    ){
        install(Auth)
        install(Postgrest)
    }
}