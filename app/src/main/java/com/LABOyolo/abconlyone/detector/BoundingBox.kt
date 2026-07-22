package com.LABOyolo.abconlyone.detector

/**
 * Representa una deteccion: coordenadas en pixeles del frame analizado,
 * la clase detectada y el score de confianza.
 */
data class BoundingBox(
    val x1: Float,
    val y1: Float,
    val x2: Float,
    val y2: Float,
    val score: Float,
    val classId: Int,
    val label: String
)
