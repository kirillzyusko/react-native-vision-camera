package com.mrousavy.camera.extensions

import androidx.camera.core.DynamicRange

val DynamicRange.isSDR: Boolean
  get() = encoding == DynamicRange.ENCODING_SDR || encoding == DynamicRange.ENCODING_UNSPECIFIED
