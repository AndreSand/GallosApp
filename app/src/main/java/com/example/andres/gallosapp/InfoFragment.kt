package com.example.andres.gallosapp

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class InfoFragment : Fragment() {
    val TAG = "FramentAbout"

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView")
        return inflater!!.inflate(R.layout.fragment_info, container, false)
    }

    override fun onAttach(context: Context?) {
        Log.d(TAG, "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        // about link cicklable
//        more_info.movementMethod = LinkMovementMethod.getInstance()

//        ib_facebook.setOnClickListener {
//            val myWebLink = Intent(Intent.ACTION_VIEW)
//            myWebLink.data = Uri.parse("https://www.facebook.com/")
//            startActivity(myWebLink)
//            // toast("opening facebook webView");
//        }
//
//        ib_twitter.setOnClickListener() {
//            val myWebLink = Intent(Intent.ACTION_VIEW)
//            myWebLink.data = Uri.parse("https://twitter.com/")
//            startActivity(myWebLink)
//            // toast("opening twitter webView");
//
//            ib_instagram.setOnClickListener() {
//                val myWebLink = Intent(Intent.ACTION_VIEW)
//                myWebLink.data = Uri.parse("https://www.instagram.com/")
//                startActivity(myWebLink)
//                 toast("opening instagram webView");
//            }
//        }

        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onDetach() {
        Log.d(TAG, "onDetach")
        super.onDetach()
    }
}
