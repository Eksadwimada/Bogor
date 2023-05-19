package com.example.tripbogor

import android.os.Parcel
import android.os.Parcelable


@Parcelize
data class Tour (
    var imageTour: Int = 0,
    var titleTour: String?,
    var descTour: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(imageTour)
        parcel.writeString(titleTour)
        parcel.writeString(descTour)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Tour> {
        override fun createFromParcel(parcel: Parcel): Tour {
            return Tour(parcel)
        }

        override fun newArray(size: Int): Array<Tour?> {
            return arrayOfNulls(size)
        }
    }
}


