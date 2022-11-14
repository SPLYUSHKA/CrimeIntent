package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
data class Crime(@PrimaryKey val id :UUID = UUID.randomUUID(),  var Title: String? = null,
                 var Date: Date = Date(), var isSolved: Boolean = false, var RequiresPolice : Boolean = false,var suspect :String = " "
    ){
/*     fun Crime(id: UUID?) {
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

    fun getMId(): UUID? {
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
         return "IMG" + getMId().toString() + ".jpg"
     }*/
}