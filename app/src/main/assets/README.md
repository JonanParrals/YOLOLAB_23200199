# Instrucciones para el modelo YOLOv8 LiteRT

Para completar la ejecución en dispositivo físico:
1. Exportar el modelo YOLOv8n a formato LiteRT usando `uv` / Python:
   ```bash
   uv run yolo export model=yolov8n.pt format=litert imgsz=320
   ```
2. Renombrar / copiar el archivo resultante `.tflite` a:
   `app/src/main/assets/yolov8n_person_fp16.tflite`
