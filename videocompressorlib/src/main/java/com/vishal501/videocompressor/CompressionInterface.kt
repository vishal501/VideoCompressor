package com.vishal501.videocompressor

import androidx.annotation.MainThread
import androidx.annotation.WorkerThread

/**
 * Created by Vishal Singh on 14 June, 2023
 * vs66429@gmail.com
 */
interface CompressionListener {
    @MainThread
    fun onStart(index: Int)

    @MainThread
    fun onSuccess(index: Int, size: Long, path: String?)

    @MainThread
    fun onFailure(index: Int, failureMessage: String)

    @WorkerThread
    fun onProgress(index: Int, percent: Float)

    @WorkerThread
    fun onCancelled(index: Int)
}

interface CompressionProgressListener {
    fun onProgressChanged(index: Int, percent: Float)
    fun onProgressCancelled(index: Int)
}