package com.example.myapplication

import java.util.*

 class Crime {
     private var mId: UUID? = null
     private var mTitle: String? = null
     private var mDate: Date? = null
     private var mSolved = false
     private var mRequiresPolice = false
     private var mSuspect: String? = null

     fun Crime(id: UUID?) {
         mId = id
         mDate = Date()
     }

     fun Crime() {
         (UUID.randomUUID())
     }

     fun RequiresPolice(): Boolean {
         return mRequiresPolice
     }

     fun setRequiresPolice(mReqPolice: Boolean) {
         mRequiresPolice = mReqPolice
     }

     fun getId(): UUID? {
         return mId
     }

     fun getTitle(): String? {
         return mTitle
     }

     fun setTitle(mTitle: String?) {
         this.mTitle = mTitle
     }

     fun getDate(): Date? {
         return mDate
     }

     fun setDate(mDate: Date?) {
         this.mDate = mDate
     }

     fun isSolved(): Boolean {
         return mSolved
     }

     fun setSolved(_mSolved: Boolean) {
         mSolved = _mSolved
     }

     fun getTime(): Long {
         return mDate!!.time
     }

     fun setTime(mTime: Long) {
         mDate!!.time = mTime
     }

     fun getSuspect(): String? {
         return mSuspect
     }

     fun setSuspect(suspect: String) {
         mSuspect = suspect
     }

     fun getPhotoFilename(): String? {
         return "IMG" + getId().toString() + ".jpg"
     }
}