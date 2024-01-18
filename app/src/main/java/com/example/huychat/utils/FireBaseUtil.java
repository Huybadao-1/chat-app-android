package com.example.huychat.utils;

import androidx.dynamicanimation.animation.SpringAnimation;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class FireBaseUtil {

    public static String currentUserId(){
        return FirebaseAuth.getInstance().getUid();
    }
    public static DocumentReference currentUserDetail(){
        return FirebaseFirestore.getInstance().collection("user").document(currentUserId());
    }
}
