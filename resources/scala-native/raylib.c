#include <string.h>
#include "raylib.h"
#include "raymath.h"

void __sn_wrap_raylib_AttachAudioStreamProcessor(AudioStream *stream, AudioCallback processor) {
 AttachAudioStreamProcessor(*stream, processor);
};


void __sn_wrap_raylib_BeginMode2D(Camera2D *camera) {
 BeginMode2D(*camera);
};


void __sn_wrap_raylib_BeginMode3D(Camera3D *camera) {
 BeginMode3D(*camera);
};


void __sn_wrap_raylib_BeginShaderMode(Shader *shader) {
 BeginShaderMode(*shader);
};


void __sn_wrap_raylib_BeginTextureMode(RenderTexture2D *target) {
 BeginTextureMode(*target);
};


void __sn_wrap_raylib_BeginVrStereoMode(VrStereoConfig *config) {
 BeginVrStereoMode(*config);
};


_Bool __sn_wrap_raylib_CheckCollisionBoxSphere(BoundingBox *box, Vector3 *center, float radius) {
 return CheckCollisionBoxSphere(*box, *center, radius);
};


_Bool __sn_wrap_raylib_CheckCollisionBoxes(BoundingBox *box1, BoundingBox *box2) {
 return CheckCollisionBoxes(*box1, *box2);
};


_Bool __sn_wrap_raylib_CheckCollisionCircleLine(Vector2 *center, float radius, Vector2 *p1, Vector2 *p2) {
 return CheckCollisionCircleLine(*center, radius, *p1, *p2);
};


_Bool __sn_wrap_raylib_CheckCollisionCircleRec(Vector2 *center, float radius, Rectangle *rec) {
 return CheckCollisionCircleRec(*center, radius, *rec);
};


_Bool __sn_wrap_raylib_CheckCollisionCircles(Vector2 *center1, float radius1, Vector2 *center2, float radius2) {
 return CheckCollisionCircles(*center1, radius1, *center2, radius2);
};


_Bool __sn_wrap_raylib_CheckCollisionLines(Vector2 *startPos1, Vector2 *endPos1, Vector2 *startPos2, Vector2 *endPos2, Vector2 * collisionPoint) {
 return CheckCollisionLines(*startPos1, *endPos1, *startPos2, *endPos2, collisionPoint);
};


_Bool __sn_wrap_raylib_CheckCollisionPointCircle(Vector2 *point, Vector2 *center, float radius) {
 return CheckCollisionPointCircle(*point, *center, radius);
};


_Bool __sn_wrap_raylib_CheckCollisionPointLine(Vector2 *point, Vector2 *p1, Vector2 *p2, int threshold) {
 return CheckCollisionPointLine(*point, *p1, *p2, threshold);
};


_Bool __sn_wrap_raylib_CheckCollisionPointPoly(Vector2 *point, const Vector2 * points, int pointCount) {
 return CheckCollisionPointPoly(*point, points, pointCount);
};


_Bool __sn_wrap_raylib_CheckCollisionPointRec(Vector2 *point, Rectangle *rec) {
 return CheckCollisionPointRec(*point, *rec);
};


_Bool __sn_wrap_raylib_CheckCollisionPointTriangle(Vector2 *point, Vector2 *p1, Vector2 *p2, Vector2 *p3) {
 return CheckCollisionPointTriangle(*point, *p1, *p2, *p3);
};


_Bool __sn_wrap_raylib_CheckCollisionRecs(Rectangle *rec1, Rectangle *rec2) {
 return CheckCollisionRecs(*rec1, *rec2);
};


_Bool __sn_wrap_raylib_CheckCollisionSpheres(Vector3 *center1, float radius1, Vector3 *center2, float radius2) {
 return CheckCollisionSpheres(*center1, radius1, *center2, radius2);
};


void __sn_wrap_raylib_ClearBackground(Color *color) {
 ClearBackground(*color);
};


void __sn_wrap_raylib_ColorAlpha(Color *color, float alpha, Color *____return) {
  Color ____ret = ColorAlpha(*color, alpha);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_ColorAlphaBlend(Color *dst, Color *src, Color *tint, Color *____return) {
  Color ____ret = ColorAlphaBlend(*dst, *src, *tint);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_ColorBrightness(Color *color, float factor, Color *____return) {
  Color ____ret = ColorBrightness(*color, factor);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_ColorContrast(Color *color, float contrast, Color *____return) {
  Color ____ret = ColorContrast(*color, contrast);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_ColorFromHSV(float hue, float saturation, float value, Color *____return) {
  Color ____ret = ColorFromHSV(hue, saturation, value);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_ColorFromNormalized(Vector4 *normalized, Color *____return) {
  Color ____ret = ColorFromNormalized(*normalized);
  memcpy(____return, &____ret, sizeof(Color));
}


_Bool __sn_wrap_raylib_ColorIsEqual(Color *col1, Color *col2) {
 return ColorIsEqual(*col1, *col2);
};


void __sn_wrap_raylib_ColorLerp(Color *color1, Color *color2, float factor, Color *____return) {
  Color ____ret = ColorLerp(*color1, *color2, factor);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_ColorNormalize(Color *color, Vector4 *____return) {
  Vector4 ____ret = ColorNormalize(*color);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_ColorTint(Color *color, Color *tint, Color *____return) {
  Color ____ret = ColorTint(*color, *tint);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_ColorToHSV(Color *color, Vector3 *____return) {
  Vector3 ____ret = ColorToHSV(*color);
  memcpy(____return, &____ret, sizeof(Vector3));
}


int __sn_wrap_raylib_ColorToInt(Color *color) {
 return ColorToInt(*color);
};


void __sn_wrap_raylib_DetachAudioStreamProcessor(AudioStream *stream, AudioCallback processor) {
 DetachAudioStreamProcessor(*stream, processor);
};


void __sn_wrap_raylib_DrawBillboard(Camera *camera, Texture2D *texture, Vector3 *position, float scale, Color *tint) {
 DrawBillboard(*camera, *texture, *position, scale, *tint);
};


void __sn_wrap_raylib_DrawBillboardPro(Camera *camera, Texture2D *texture, Rectangle *source, Vector3 *position, Vector3 *up, Vector2 *size, Vector2 *origin, float rotation, Color *tint) {
 DrawBillboardPro(*camera, *texture, *source, *position, *up, *size, *origin, rotation, *tint);
};


void __sn_wrap_raylib_DrawBillboardRec(Camera *camera, Texture2D *texture, Rectangle *source, Vector3 *position, Vector2 *size, Color *tint) {
 DrawBillboardRec(*camera, *texture, *source, *position, *size, *tint);
};


void __sn_wrap_raylib_DrawBoundingBox(BoundingBox *box, Color *color) {
 DrawBoundingBox(*box, *color);
};


void __sn_wrap_raylib_DrawCapsule(Vector3 *startPos, Vector3 *endPos, float radius, int slices, int rings, Color *color) {
 DrawCapsule(*startPos, *endPos, radius, slices, rings, *color);
};


void __sn_wrap_raylib_DrawCapsuleWires(Vector3 *startPos, Vector3 *endPos, float radius, int slices, int rings, Color *color) {
 DrawCapsuleWires(*startPos, *endPos, radius, slices, rings, *color);
};


void __sn_wrap_raylib_DrawCircle(int centerX, int centerY, float radius, Color *color) {
 DrawCircle(centerX, centerY, radius, *color);
};


void __sn_wrap_raylib_DrawCircle3D(Vector3 *center, float radius, Vector3 *rotationAxis, float rotationAngle, Color *color) {
 DrawCircle3D(*center, radius, *rotationAxis, rotationAngle, *color);
};


void __sn_wrap_raylib_DrawCircleGradient(int centerX, int centerY, float radius, Color *inner, Color *outer) {
 DrawCircleGradient(centerX, centerY, radius, *inner, *outer);
};


void __sn_wrap_raylib_DrawCircleLines(int centerX, int centerY, float radius, Color *color) {
 DrawCircleLines(centerX, centerY, radius, *color);
};


void __sn_wrap_raylib_DrawCircleLinesV(Vector2 *center, float radius, Color *color) {
 DrawCircleLinesV(*center, radius, *color);
};


void __sn_wrap_raylib_DrawCircleSector(Vector2 *center, float radius, float startAngle, float endAngle, int segments, Color *color) {
 DrawCircleSector(*center, radius, startAngle, endAngle, segments, *color);
};


void __sn_wrap_raylib_DrawCircleSectorLines(Vector2 *center, float radius, float startAngle, float endAngle, int segments, Color *color) {
 DrawCircleSectorLines(*center, radius, startAngle, endAngle, segments, *color);
};


void __sn_wrap_raylib_DrawCircleV(Vector2 *center, float radius, Color *color) {
 DrawCircleV(*center, radius, *color);
};


void __sn_wrap_raylib_DrawCube(Vector3 *position, float width, float height, float length, Color *color) {
 DrawCube(*position, width, height, length, *color);
};


void __sn_wrap_raylib_DrawCubeV(Vector3 *position, Vector3 *size, Color *color) {
 DrawCubeV(*position, *size, *color);
};


void __sn_wrap_raylib_DrawCubeWires(Vector3 *position, float width, float height, float length, Color *color) {
 DrawCubeWires(*position, width, height, length, *color);
};


void __sn_wrap_raylib_DrawCubeWiresV(Vector3 *position, Vector3 *size, Color *color) {
 DrawCubeWiresV(*position, *size, *color);
};


void __sn_wrap_raylib_DrawCylinder(Vector3 *position, float radiusTop, float radiusBottom, float height, int slices, Color *color) {
 DrawCylinder(*position, radiusTop, radiusBottom, height, slices, *color);
};


void __sn_wrap_raylib_DrawCylinderEx(Vector3 *startPos, Vector3 *endPos, float startRadius, float endRadius, int sides, Color *color) {
 DrawCylinderEx(*startPos, *endPos, startRadius, endRadius, sides, *color);
};


void __sn_wrap_raylib_DrawCylinderWires(Vector3 *position, float radiusTop, float radiusBottom, float height, int slices, Color *color) {
 DrawCylinderWires(*position, radiusTop, radiusBottom, height, slices, *color);
};


void __sn_wrap_raylib_DrawCylinderWiresEx(Vector3 *startPos, Vector3 *endPos, float startRadius, float endRadius, int sides, Color *color) {
 DrawCylinderWiresEx(*startPos, *endPos, startRadius, endRadius, sides, *color);
};


void __sn_wrap_raylib_DrawEllipse(int centerX, int centerY, float radiusH, float radiusV, Color *color) {
 DrawEllipse(centerX, centerY, radiusH, radiusV, *color);
};


void __sn_wrap_raylib_DrawEllipseLines(int centerX, int centerY, float radiusH, float radiusV, Color *color) {
 DrawEllipseLines(centerX, centerY, radiusH, radiusV, *color);
};


void __sn_wrap_raylib_DrawLine(int startPosX, int startPosY, int endPosX, int endPosY, Color *color) {
 DrawLine(startPosX, startPosY, endPosX, endPosY, *color);
};


void __sn_wrap_raylib_DrawLine3D(Vector3 *startPos, Vector3 *endPos, Color *color) {
 DrawLine3D(*startPos, *endPos, *color);
};


void __sn_wrap_raylib_DrawLineBezier(Vector2 *startPos, Vector2 *endPos, float thick, Color *color) {
 DrawLineBezier(*startPos, *endPos, thick, *color);
};


void __sn_wrap_raylib_DrawLineEx(Vector2 *startPos, Vector2 *endPos, float thick, Color *color) {
 DrawLineEx(*startPos, *endPos, thick, *color);
};


void __sn_wrap_raylib_DrawLineStrip(const Vector2 * points, int pointCount, Color *color) {
 DrawLineStrip(points, pointCount, *color);
};


void __sn_wrap_raylib_DrawLineV(Vector2 *startPos, Vector2 *endPos, Color *color) {
 DrawLineV(*startPos, *endPos, *color);
};


void __sn_wrap_raylib_DrawMesh(Mesh *mesh, Material *material, Matrix *transform) {
 DrawMesh(*mesh, *material, *transform);
};


void __sn_wrap_raylib_DrawMeshInstanced(Mesh *mesh, Material *material, const Matrix * transforms, int instances) {
 DrawMeshInstanced(*mesh, *material, transforms, instances);
};


void __sn_wrap_raylib_DrawModel(Model *model, Vector3 *position, float scale, Color *tint) {
 DrawModel(*model, *position, scale, *tint);
};


void __sn_wrap_raylib_DrawModelEx(Model *model, Vector3 *position, Vector3 *rotationAxis, float rotationAngle, Vector3 *scale, Color *tint) {
 DrawModelEx(*model, *position, *rotationAxis, rotationAngle, *scale, *tint);
};


void __sn_wrap_raylib_DrawModelPoints(Model *model, Vector3 *position, float scale, Color *tint) {
 DrawModelPoints(*model, *position, scale, *tint);
};


void __sn_wrap_raylib_DrawModelPointsEx(Model *model, Vector3 *position, Vector3 *rotationAxis, float rotationAngle, Vector3 *scale, Color *tint) {
 DrawModelPointsEx(*model, *position, *rotationAxis, rotationAngle, *scale, *tint);
};


void __sn_wrap_raylib_DrawModelWires(Model *model, Vector3 *position, float scale, Color *tint) {
 DrawModelWires(*model, *position, scale, *tint);
};


void __sn_wrap_raylib_DrawModelWiresEx(Model *model, Vector3 *position, Vector3 *rotationAxis, float rotationAngle, Vector3 *scale, Color *tint) {
 DrawModelWiresEx(*model, *position, *rotationAxis, rotationAngle, *scale, *tint);
};


void __sn_wrap_raylib_DrawPixel(int posX, int posY, Color *color) {
 DrawPixel(posX, posY, *color);
};


void __sn_wrap_raylib_DrawPixelV(Vector2 *position, Color *color) {
 DrawPixelV(*position, *color);
};


void __sn_wrap_raylib_DrawPlane(Vector3 *centerPos, Vector2 *size, Color *color) {
 DrawPlane(*centerPos, *size, *color);
};


void __sn_wrap_raylib_DrawPoint3D(Vector3 *position, Color *color) {
 DrawPoint3D(*position, *color);
};


void __sn_wrap_raylib_DrawPoly(Vector2 *center, int sides, float radius, float rotation, Color *color) {
 DrawPoly(*center, sides, radius, rotation, *color);
};


void __sn_wrap_raylib_DrawPolyLines(Vector2 *center, int sides, float radius, float rotation, Color *color) {
 DrawPolyLines(*center, sides, radius, rotation, *color);
};


void __sn_wrap_raylib_DrawPolyLinesEx(Vector2 *center, int sides, float radius, float rotation, float lineThick, Color *color) {
 DrawPolyLinesEx(*center, sides, radius, rotation, lineThick, *color);
};


void __sn_wrap_raylib_DrawRay(Ray *ray, Color *color) {
 DrawRay(*ray, *color);
};


void __sn_wrap_raylib_DrawRectangle(int posX, int posY, int width, int height, Color *color) {
 DrawRectangle(posX, posY, width, height, *color);
};


void __sn_wrap_raylib_DrawRectangleGradientEx(Rectangle *rec, Color *topLeft, Color *bottomLeft, Color *topRight, Color *bottomRight) {
 DrawRectangleGradientEx(*rec, *topLeft, *bottomLeft, *topRight, *bottomRight);
};


void __sn_wrap_raylib_DrawRectangleGradientH(int posX, int posY, int width, int height, Color *left, Color *right) {
 DrawRectangleGradientH(posX, posY, width, height, *left, *right);
};


void __sn_wrap_raylib_DrawRectangleGradientV(int posX, int posY, int width, int height, Color *top, Color *bottom) {
 DrawRectangleGradientV(posX, posY, width, height, *top, *bottom);
};


void __sn_wrap_raylib_DrawRectangleLines(int posX, int posY, int width, int height, Color *color) {
 DrawRectangleLines(posX, posY, width, height, *color);
};


void __sn_wrap_raylib_DrawRectangleLinesEx(Rectangle *rec, float lineThick, Color *color) {
 DrawRectangleLinesEx(*rec, lineThick, *color);
};


void __sn_wrap_raylib_DrawRectanglePro(Rectangle *rec, Vector2 *origin, float rotation, Color *color) {
 DrawRectanglePro(*rec, *origin, rotation, *color);
};


void __sn_wrap_raylib_DrawRectangleRec(Rectangle *rec, Color *color) {
 DrawRectangleRec(*rec, *color);
};


void __sn_wrap_raylib_DrawRectangleRounded(Rectangle *rec, float roundness, int segments, Color *color) {
 DrawRectangleRounded(*rec, roundness, segments, *color);
};


void __sn_wrap_raylib_DrawRectangleRoundedLines(Rectangle *rec, float roundness, int segments, Color *color) {
 DrawRectangleRoundedLines(*rec, roundness, segments, *color);
};


void __sn_wrap_raylib_DrawRectangleRoundedLinesEx(Rectangle *rec, float roundness, int segments, float lineThick, Color *color) {
 DrawRectangleRoundedLinesEx(*rec, roundness, segments, lineThick, *color);
};


void __sn_wrap_raylib_DrawRectangleV(Vector2 *position, Vector2 *size, Color *color) {
 DrawRectangleV(*position, *size, *color);
};


void __sn_wrap_raylib_DrawRing(Vector2 *center, float innerRadius, float outerRadius, float startAngle, float endAngle, int segments, Color *color) {
 DrawRing(*center, innerRadius, outerRadius, startAngle, endAngle, segments, *color);
};


void __sn_wrap_raylib_DrawRingLines(Vector2 *center, float innerRadius, float outerRadius, float startAngle, float endAngle, int segments, Color *color) {
 DrawRingLines(*center, innerRadius, outerRadius, startAngle, endAngle, segments, *color);
};


void __sn_wrap_raylib_DrawSphere(Vector3 *centerPos, float radius, Color *color) {
 DrawSphere(*centerPos, radius, *color);
};


void __sn_wrap_raylib_DrawSphereEx(Vector3 *centerPos, float radius, int rings, int slices, Color *color) {
 DrawSphereEx(*centerPos, radius, rings, slices, *color);
};


void __sn_wrap_raylib_DrawSphereWires(Vector3 *centerPos, float radius, int rings, int slices, Color *color) {
 DrawSphereWires(*centerPos, radius, rings, slices, *color);
};


void __sn_wrap_raylib_DrawSplineBasis(const Vector2 * points, int pointCount, float thick, Color *color) {
 DrawSplineBasis(points, pointCount, thick, *color);
};


void __sn_wrap_raylib_DrawSplineBezierCubic(const Vector2 * points, int pointCount, float thick, Color *color) {
 DrawSplineBezierCubic(points, pointCount, thick, *color);
};


void __sn_wrap_raylib_DrawSplineBezierQuadratic(const Vector2 * points, int pointCount, float thick, Color *color) {
 DrawSplineBezierQuadratic(points, pointCount, thick, *color);
};


void __sn_wrap_raylib_DrawSplineCatmullRom(const Vector2 * points, int pointCount, float thick, Color *color) {
 DrawSplineCatmullRom(points, pointCount, thick, *color);
};


void __sn_wrap_raylib_DrawSplineLinear(const Vector2 * points, int pointCount, float thick, Color *color) {
 DrawSplineLinear(points, pointCount, thick, *color);
};


void __sn_wrap_raylib_DrawSplineSegmentBasis(Vector2 *p1, Vector2 *p2, Vector2 *p3, Vector2 *p4, float thick, Color *color) {
 DrawSplineSegmentBasis(*p1, *p2, *p3, *p4, thick, *color);
};


void __sn_wrap_raylib_DrawSplineSegmentBezierCubic(Vector2 *p1, Vector2 *c2, Vector2 *c3, Vector2 *p4, float thick, Color *color) {
 DrawSplineSegmentBezierCubic(*p1, *c2, *c3, *p4, thick, *color);
};


void __sn_wrap_raylib_DrawSplineSegmentBezierQuadratic(Vector2 *p1, Vector2 *c2, Vector2 *p3, float thick, Color *color) {
 DrawSplineSegmentBezierQuadratic(*p1, *c2, *p3, thick, *color);
};


void __sn_wrap_raylib_DrawSplineSegmentCatmullRom(Vector2 *p1, Vector2 *p2, Vector2 *p3, Vector2 *p4, float thick, Color *color) {
 DrawSplineSegmentCatmullRom(*p1, *p2, *p3, *p4, thick, *color);
};


void __sn_wrap_raylib_DrawSplineSegmentLinear(Vector2 *p1, Vector2 *p2, float thick, Color *color) {
 DrawSplineSegmentLinear(*p1, *p2, thick, *color);
};


void __sn_wrap_raylib_DrawText(const char * text, int posX, int posY, int fontSize, Color *color) {
 DrawText(text, posX, posY, fontSize, *color);
};


void __sn_wrap_raylib_DrawTextCodepoint(Font *font, int codepoint, Vector2 *position, float fontSize, Color *tint) {
 DrawTextCodepoint(*font, codepoint, *position, fontSize, *tint);
};


void __sn_wrap_raylib_DrawTextCodepoints(Font *font, const int * codepoints, int codepointCount, Vector2 *position, float fontSize, float spacing, Color *tint) {
 DrawTextCodepoints(*font, codepoints, codepointCount, *position, fontSize, spacing, *tint);
};


void __sn_wrap_raylib_DrawTextEx(Font *font, const char * text, Vector2 *position, float fontSize, float spacing, Color *tint) {
 DrawTextEx(*font, text, *position, fontSize, spacing, *tint);
};


void __sn_wrap_raylib_DrawTextPro(Font *font, const char * text, Vector2 *position, Vector2 *origin, float rotation, float fontSize, float spacing, Color *tint) {
 DrawTextPro(*font, text, *position, *origin, rotation, fontSize, spacing, *tint);
};


void __sn_wrap_raylib_DrawTexture(Texture2D *texture, int posX, int posY, Color *tint) {
 DrawTexture(*texture, posX, posY, *tint);
};


void __sn_wrap_raylib_DrawTextureEx(Texture2D *texture, Vector2 *position, float rotation, float scale, Color *tint) {
 DrawTextureEx(*texture, *position, rotation, scale, *tint);
};


void __sn_wrap_raylib_DrawTextureNPatch(Texture2D *texture, NPatchInfo *nPatchInfo, Rectangle *dest, Vector2 *origin, float rotation, Color *tint) {
 DrawTextureNPatch(*texture, *nPatchInfo, *dest, *origin, rotation, *tint);
};


void __sn_wrap_raylib_DrawTexturePro(Texture2D *texture, Rectangle *source, Rectangle *dest, Vector2 *origin, float rotation, Color *tint) {
 DrawTexturePro(*texture, *source, *dest, *origin, rotation, *tint);
};


void __sn_wrap_raylib_DrawTextureRec(Texture2D *texture, Rectangle *source, Vector2 *position, Color *tint) {
 DrawTextureRec(*texture, *source, *position, *tint);
};


void __sn_wrap_raylib_DrawTextureV(Texture2D *texture, Vector2 *position, Color *tint) {
 DrawTextureV(*texture, *position, *tint);
};


void __sn_wrap_raylib_DrawTriangle(Vector2 *v1, Vector2 *v2, Vector2 *v3, Color *color) {
 DrawTriangle(*v1, *v2, *v3, *color);
};


void __sn_wrap_raylib_DrawTriangle3D(Vector3 *v1, Vector3 *v2, Vector3 *v3, Color *color) {
 DrawTriangle3D(*v1, *v2, *v3, *color);
};


void __sn_wrap_raylib_DrawTriangleFan(const Vector2 * points, int pointCount, Color *color) {
 DrawTriangleFan(points, pointCount, *color);
};


void __sn_wrap_raylib_DrawTriangleLines(Vector2 *v1, Vector2 *v2, Vector2 *v3, Color *color) {
 DrawTriangleLines(*v1, *v2, *v3, *color);
};


void __sn_wrap_raylib_DrawTriangleStrip(const Vector2 * points, int pointCount, Color *color) {
 DrawTriangleStrip(points, pointCount, *color);
};


void __sn_wrap_raylib_DrawTriangleStrip3D(const Vector3 * points, int pointCount, Color *color) {
 DrawTriangleStrip3D(points, pointCount, *color);
};


_Bool __sn_wrap_raylib_ExportAutomationEventList(AutomationEventList *list, const char * fileName) {
 return ExportAutomationEventList(*list, fileName);
};


_Bool __sn_wrap_raylib_ExportFontAsCode(Font *font, const char * fileName) {
 return ExportFontAsCode(*font, fileName);
};


_Bool __sn_wrap_raylib_ExportImage(Image *image, const char * fileName) {
 return ExportImage(*image, fileName);
};


_Bool __sn_wrap_raylib_ExportImageAsCode(Image *image, const char * fileName) {
 return ExportImageAsCode(*image, fileName);
};


unsigned char * __sn_wrap_raylib_ExportImageToMemory(Image *image, const char * fileType, int * fileSize) {
 return ExportImageToMemory(*image, fileType, fileSize);
};


_Bool __sn_wrap_raylib_ExportMesh(Mesh *mesh, const char * fileName) {
 return ExportMesh(*mesh, fileName);
};


_Bool __sn_wrap_raylib_ExportMeshAsCode(Mesh *mesh, const char * fileName) {
 return ExportMeshAsCode(*mesh, fileName);
};


_Bool __sn_wrap_raylib_ExportWave(Wave *wave, const char * fileName) {
 return ExportWave(*wave, fileName);
};


_Bool __sn_wrap_raylib_ExportWaveAsCode(Wave *wave, const char * fileName) {
 return ExportWaveAsCode(*wave, fileName);
};


void __sn_wrap_raylib_Fade(Color *color, float alpha, Color *____return) {
  Color ____ret = Fade(*color, alpha);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_GenImageCellular(int width, int height, int tileSize, Image *____return) {
  Image ____ret = GenImageCellular(width, height, tileSize);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GenImageChecked(int width, int height, int checksX, int checksY, Color *col1, Color *col2, Image *____return) {
  Image ____ret = GenImageChecked(width, height, checksX, checksY, *col1, *col2);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GenImageColor(int width, int height, Color *color, Image *____return) {
  Image ____ret = GenImageColor(width, height, *color);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GenImageFontAtlas(const GlyphInfo * glyphs, Rectangle ** glyphRecs, int glyphCount, int fontSize, int padding, int packMethod, Image *____return) {
  Image ____ret = GenImageFontAtlas(glyphs, glyphRecs, glyphCount, fontSize, padding, packMethod);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GenImageGradientLinear(int width, int height, int direction, Color *start, Color *end, Image *____return) {
  Image ____ret = GenImageGradientLinear(width, height, direction, *start, *end);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GenImageGradientRadial(int width, int height, float density, Color *inner, Color *outer, Image *____return) {
  Image ____ret = GenImageGradientRadial(width, height, density, *inner, *outer);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GenImageGradientSquare(int width, int height, float density, Color *inner, Color *outer, Image *____return) {
  Image ____ret = GenImageGradientSquare(width, height, density, *inner, *outer);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GenImagePerlinNoise(int width, int height, int offsetX, int offsetY, float scale, Image *____return) {
  Image ____ret = GenImagePerlinNoise(width, height, offsetX, offsetY, scale);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GenImageText(int width, int height, const char * text, Image *____return) {
  Image ____ret = GenImageText(width, height, text);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GenImageWhiteNoise(int width, int height, float factor, Image *____return) {
  Image ____ret = GenImageWhiteNoise(width, height, factor);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GenMeshCone(float radius, float height, int slices, Mesh *____return) {
  Mesh ____ret = GenMeshCone(radius, height, slices);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GenMeshCube(float width, float height, float length, Mesh *____return) {
  Mesh ____ret = GenMeshCube(width, height, length);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GenMeshCubicmap(Image *cubicmap, Vector3 *cubeSize, Mesh *____return) {
  Mesh ____ret = GenMeshCubicmap(*cubicmap, *cubeSize);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GenMeshCylinder(float radius, float height, int slices, Mesh *____return) {
  Mesh ____ret = GenMeshCylinder(radius, height, slices);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GenMeshHeightmap(Image *heightmap, Vector3 *size, Mesh *____return) {
  Mesh ____ret = GenMeshHeightmap(*heightmap, *size);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GenMeshHemiSphere(float radius, int rings, int slices, Mesh *____return) {
  Mesh ____ret = GenMeshHemiSphere(radius, rings, slices);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GenMeshKnot(float radius, float size, int radSeg, int sides, Mesh *____return) {
  Mesh ____ret = GenMeshKnot(radius, size, radSeg, sides);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GenMeshPlane(float width, float length, int resX, int resZ, Mesh *____return) {
  Mesh ____ret = GenMeshPlane(width, length, resX, resZ);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GenMeshPoly(int sides, float radius, Mesh *____return) {
  Mesh ____ret = GenMeshPoly(sides, radius);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GenMeshSphere(float radius, int rings, int slices, Mesh *____return) {
  Mesh ____ret = GenMeshSphere(radius, rings, slices);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GenMeshTorus(float radius, float size, int radSeg, int sides, Mesh *____return) {
  Mesh ____ret = GenMeshTorus(radius, size, radSeg, sides);
  memcpy(____return, &____ret, sizeof(Mesh));
}


void __sn_wrap_raylib_GetCameraMatrix(Camera *camera, Matrix *____return) {
  Matrix ____ret = GetCameraMatrix(*camera);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_GetCameraMatrix2D(Camera2D *camera, Matrix *____return) {
  Matrix ____ret = GetCameraMatrix2D(*camera);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_GetClipboardImage(Image *____return) {
  Image ____ret = GetClipboardImage();
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_GetCollisionRec(Rectangle *rec1, Rectangle *rec2, Rectangle *____return) {
  Rectangle ____ret = GetCollisionRec(*rec1, *rec2);
  memcpy(____return, &____ret, sizeof(Rectangle));
}


void __sn_wrap_raylib_GetColor(unsigned int hexValue, Color *____return) {
  Color ____ret = GetColor(hexValue);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_GetFontDefault(Font *____return) {
  Font ____ret = GetFontDefault();
  memcpy(____return, &____ret, sizeof(Font));
}


void __sn_wrap_raylib_GetGestureDragVector(Vector2 *____return) {
  Vector2 ____ret = GetGestureDragVector();
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetGesturePinchVector(Vector2 *____return) {
  Vector2 ____ret = GetGesturePinchVector();
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetGlyphAtlasRec(Font *font, int codepoint, Rectangle *____return) {
  Rectangle ____ret = GetGlyphAtlasRec(*font, codepoint);
  memcpy(____return, &____ret, sizeof(Rectangle));
}


int __sn_wrap_raylib_GetGlyphIndex(Font *font, int codepoint) {
 return GetGlyphIndex(*font, codepoint);
};


void __sn_wrap_raylib_GetGlyphInfo(Font *font, int codepoint, GlyphInfo *____return) {
  GlyphInfo ____ret = GetGlyphInfo(*font, codepoint);
  memcpy(____return, &____ret, sizeof(GlyphInfo));
}


void __sn_wrap_raylib_GetImageAlphaBorder(Image *image, float threshold, Rectangle *____return) {
  Rectangle ____ret = GetImageAlphaBorder(*image, threshold);
  memcpy(____return, &____ret, sizeof(Rectangle));
}


void __sn_wrap_raylib_GetImageColor(Image *image, int x, int y, Color *____return) {
  Color ____ret = GetImageColor(*image, x, y);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_GetMeshBoundingBox(Mesh *mesh, BoundingBox *____return) {
  BoundingBox ____ret = GetMeshBoundingBox(*mesh);
  memcpy(____return, &____ret, sizeof(BoundingBox));
}


void __sn_wrap_raylib_GetModelBoundingBox(Model *model, BoundingBox *____return) {
  BoundingBox ____ret = GetModelBoundingBox(*model);
  memcpy(____return, &____ret, sizeof(BoundingBox));
}


void __sn_wrap_raylib_GetMonitorPosition(int monitor, Vector2 *____return) {
  Vector2 ____ret = GetMonitorPosition(monitor);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetMouseDelta(Vector2 *____return) {
  Vector2 ____ret = GetMouseDelta();
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetMousePosition(Vector2 *____return) {
  Vector2 ____ret = GetMousePosition();
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetMouseWheelMoveV(Vector2 *____return) {
  Vector2 ____ret = GetMouseWheelMoveV();
  memcpy(____return, &____ret, sizeof(Vector2));
}


float __sn_wrap_raylib_GetMusicTimeLength(Music *music) {
 return GetMusicTimeLength(*music);
};


float __sn_wrap_raylib_GetMusicTimePlayed(Music *music) {
 return GetMusicTimePlayed(*music);
};


void __sn_wrap_raylib_GetPixelColor(void * srcPtr, int format, Color *____return) {
  Color ____ret = GetPixelColor(srcPtr, format);
  memcpy(____return, &____ret, sizeof(Color));
}


void __sn_wrap_raylib_GetRayCollisionBox(Ray *ray, BoundingBox *box, RayCollision *____return) {
  RayCollision ____ret = GetRayCollisionBox(*ray, *box);
  memcpy(____return, &____ret, sizeof(RayCollision));
}


void __sn_wrap_raylib_GetRayCollisionMesh(Ray *ray, Mesh *mesh, Matrix *transform, RayCollision *____return) {
  RayCollision ____ret = GetRayCollisionMesh(*ray, *mesh, *transform);
  memcpy(____return, &____ret, sizeof(RayCollision));
}


void __sn_wrap_raylib_GetRayCollisionQuad(Ray *ray, Vector3 *p1, Vector3 *p2, Vector3 *p3, Vector3 *p4, RayCollision *____return) {
  RayCollision ____ret = GetRayCollisionQuad(*ray, *p1, *p2, *p3, *p4);
  memcpy(____return, &____ret, sizeof(RayCollision));
}


void __sn_wrap_raylib_GetRayCollisionSphere(Ray *ray, Vector3 *center, float radius, RayCollision *____return) {
  RayCollision ____ret = GetRayCollisionSphere(*ray, *center, radius);
  memcpy(____return, &____ret, sizeof(RayCollision));
}


void __sn_wrap_raylib_GetRayCollisionTriangle(Ray *ray, Vector3 *p1, Vector3 *p2, Vector3 *p3, RayCollision *____return) {
  RayCollision ____ret = GetRayCollisionTriangle(*ray, *p1, *p2, *p3);
  memcpy(____return, &____ret, sizeof(RayCollision));
}


void __sn_wrap_raylib_GetScreenToWorld2D(Vector2 *position, Camera2D *camera, Vector2 *____return) {
  Vector2 ____ret = GetScreenToWorld2D(*position, *camera);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetScreenToWorldRay(Vector2 *position, Camera *camera, Ray *____return) {
  Ray ____ret = GetScreenToWorldRay(*position, *camera);
  memcpy(____return, &____ret, sizeof(Ray));
}


void __sn_wrap_raylib_GetScreenToWorldRayEx(Vector2 *position, Camera *camera, int width, int height, Ray *____return) {
  Ray ____ret = GetScreenToWorldRayEx(*position, *camera, width, height);
  memcpy(____return, &____ret, sizeof(Ray));
}


int __sn_wrap_raylib_GetShaderLocation(Shader *shader, const char * uniformName) {
 return GetShaderLocation(*shader, uniformName);
};


int __sn_wrap_raylib_GetShaderLocationAttrib(Shader *shader, const char * attribName) {
 return GetShaderLocationAttrib(*shader, attribName);
};


void __sn_wrap_raylib_GetShapesTexture(Texture2D *____return) {
  Texture2D ____ret = GetShapesTexture();
  memcpy(____return, &____ret, sizeof(Texture2D));
}


void __sn_wrap_raylib_GetShapesTextureRectangle(Rectangle *____return) {
  Rectangle ____ret = GetShapesTextureRectangle();
  memcpy(____return, &____ret, sizeof(Rectangle));
}


void __sn_wrap_raylib_GetSplinePointBasis(Vector2 *p1, Vector2 *p2, Vector2 *p3, Vector2 *p4, float t, Vector2 *____return) {
  Vector2 ____ret = GetSplinePointBasis(*p1, *p2, *p3, *p4, t);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetSplinePointBezierCubic(Vector2 *p1, Vector2 *c2, Vector2 *c3, Vector2 *p4, float t, Vector2 *____return) {
  Vector2 ____ret = GetSplinePointBezierCubic(*p1, *c2, *c3, *p4, t);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetSplinePointBezierQuad(Vector2 *p1, Vector2 *c2, Vector2 *p3, float t, Vector2 *____return) {
  Vector2 ____ret = GetSplinePointBezierQuad(*p1, *c2, *p3, t);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetSplinePointCatmullRom(Vector2 *p1, Vector2 *p2, Vector2 *p3, Vector2 *p4, float t, Vector2 *____return) {
  Vector2 ____ret = GetSplinePointCatmullRom(*p1, *p2, *p3, *p4, t);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetSplinePointLinear(Vector2 *startPos, Vector2 *endPos, float t, Vector2 *____return) {
  Vector2 ____ret = GetSplinePointLinear(*startPos, *endPos, t);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetTouchPosition(int index, Vector2 *____return) {
  Vector2 ____ret = GetTouchPosition(index);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetWindowPosition(Vector2 *____return) {
  Vector2 ____ret = GetWindowPosition();
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetWindowScaleDPI(Vector2 *____return) {
  Vector2 ____ret = GetWindowScaleDPI();
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetWorldToScreen(Vector3 *position, Camera *camera, Vector2 *____return) {
  Vector2 ____ret = GetWorldToScreen(*position, *camera);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetWorldToScreen2D(Vector2 *position, Camera2D *camera, Vector2 *____return) {
  Vector2 ____ret = GetWorldToScreen2D(*position, *camera);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_GetWorldToScreenEx(Vector3 *position, Camera *camera, int width, int height, Vector2 *____return) {
  Vector2 ____ret = GetWorldToScreenEx(*position, *camera, width, height);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_ImageAlphaClear(Image * image, Color *color, float threshold) {
 ImageAlphaClear(image, *color, threshold);
};


void __sn_wrap_raylib_ImageAlphaMask(Image * image, Image *alphaMask) {
 ImageAlphaMask(image, *alphaMask);
};


void __sn_wrap_raylib_ImageClearBackground(Image * dst, Color *color) {
 ImageClearBackground(dst, *color);
};


void __sn_wrap_raylib_ImageColorReplace(Image * image, Color *color, Color *replace) {
 ImageColorReplace(image, *color, *replace);
};


void __sn_wrap_raylib_ImageColorTint(Image * image, Color *color) {
 ImageColorTint(image, *color);
};


void __sn_wrap_raylib_ImageCopy(Image *image, Image *____return) {
  Image ____ret = ImageCopy(*image);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_ImageCrop(Image * image, Rectangle *crop) {
 ImageCrop(image, *crop);
};


void __sn_wrap_raylib_ImageDraw(Image * dst, Image *src, Rectangle *srcRec, Rectangle *dstRec, Color *tint) {
 ImageDraw(dst, *src, *srcRec, *dstRec, *tint);
};


void __sn_wrap_raylib_ImageDrawCircle(Image * dst, int centerX, int centerY, int radius, Color *color) {
 ImageDrawCircle(dst, centerX, centerY, radius, *color);
};


void __sn_wrap_raylib_ImageDrawCircleLines(Image * dst, int centerX, int centerY, int radius, Color *color) {
 ImageDrawCircleLines(dst, centerX, centerY, radius, *color);
};


void __sn_wrap_raylib_ImageDrawCircleLinesV(Image * dst, Vector2 *center, int radius, Color *color) {
 ImageDrawCircleLinesV(dst, *center, radius, *color);
};


void __sn_wrap_raylib_ImageDrawCircleV(Image * dst, Vector2 *center, int radius, Color *color) {
 ImageDrawCircleV(dst, *center, radius, *color);
};


void __sn_wrap_raylib_ImageDrawLine(Image * dst, int startPosX, int startPosY, int endPosX, int endPosY, Color *color) {
 ImageDrawLine(dst, startPosX, startPosY, endPosX, endPosY, *color);
};


void __sn_wrap_raylib_ImageDrawLineEx(Image * dst, Vector2 *start, Vector2 *end, int thick, Color *color) {
 ImageDrawLineEx(dst, *start, *end, thick, *color);
};


void __sn_wrap_raylib_ImageDrawLineV(Image * dst, Vector2 *start, Vector2 *end, Color *color) {
 ImageDrawLineV(dst, *start, *end, *color);
};


void __sn_wrap_raylib_ImageDrawPixel(Image * dst, int posX, int posY, Color *color) {
 ImageDrawPixel(dst, posX, posY, *color);
};


void __sn_wrap_raylib_ImageDrawPixelV(Image * dst, Vector2 *position, Color *color) {
 ImageDrawPixelV(dst, *position, *color);
};


void __sn_wrap_raylib_ImageDrawRectangle(Image * dst, int posX, int posY, int width, int height, Color *color) {
 ImageDrawRectangle(dst, posX, posY, width, height, *color);
};


void __sn_wrap_raylib_ImageDrawRectangleLines(Image * dst, Rectangle *rec, int thick, Color *color) {
 ImageDrawRectangleLines(dst, *rec, thick, *color);
};


void __sn_wrap_raylib_ImageDrawRectangleRec(Image * dst, Rectangle *rec, Color *color) {
 ImageDrawRectangleRec(dst, *rec, *color);
};


void __sn_wrap_raylib_ImageDrawRectangleV(Image * dst, Vector2 *position, Vector2 *size, Color *color) {
 ImageDrawRectangleV(dst, *position, *size, *color);
};


void __sn_wrap_raylib_ImageDrawText(Image * dst, const char * text, int posX, int posY, int fontSize, Color *color) {
 ImageDrawText(dst, text, posX, posY, fontSize, *color);
};


void __sn_wrap_raylib_ImageDrawTextEx(Image * dst, Font *font, const char * text, Vector2 *position, float fontSize, float spacing, Color *tint) {
 ImageDrawTextEx(dst, *font, text, *position, fontSize, spacing, *tint);
};


void __sn_wrap_raylib_ImageDrawTriangle(Image * dst, Vector2 *v1, Vector2 *v2, Vector2 *v3, Color *color) {
 ImageDrawTriangle(dst, *v1, *v2, *v3, *color);
};


void __sn_wrap_raylib_ImageDrawTriangleEx(Image * dst, Vector2 *v1, Vector2 *v2, Vector2 *v3, Color *c1, Color *c2, Color *c3) {
 ImageDrawTriangleEx(dst, *v1, *v2, *v3, *c1, *c2, *c3);
};


void __sn_wrap_raylib_ImageDrawTriangleFan(Image * dst, Vector2 * points, int pointCount, Color *color) {
 ImageDrawTriangleFan(dst, points, pointCount, *color);
};


void __sn_wrap_raylib_ImageDrawTriangleLines(Image * dst, Vector2 *v1, Vector2 *v2, Vector2 *v3, Color *color) {
 ImageDrawTriangleLines(dst, *v1, *v2, *v3, *color);
};


void __sn_wrap_raylib_ImageDrawTriangleStrip(Image * dst, Vector2 * points, int pointCount, Color *color) {
 ImageDrawTriangleStrip(dst, points, pointCount, *color);
};


void __sn_wrap_raylib_ImageFromChannel(Image *image, int selectedChannel, Image *____return) {
  Image ____ret = ImageFromChannel(*image, selectedChannel);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_ImageFromImage(Image *image, Rectangle *rec, Image *____return) {
  Image ____ret = ImageFromImage(*image, *rec);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_ImageResizeCanvas(Image * image, int newWidth, int newHeight, int offsetX, int offsetY, Color *fill) {
 ImageResizeCanvas(image, newWidth, newHeight, offsetX, offsetY, *fill);
};


void __sn_wrap_raylib_ImageText(const char * text, int fontSize, Color *color, Image *____return) {
  Image ____ret = ImageText(text, fontSize, *color);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_ImageTextEx(Font *font, const char * text, float fontSize, float spacing, Color *tint, Image *____return) {
  Image ____ret = ImageTextEx(*font, text, fontSize, spacing, *tint);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_ImageToPOT(Image * image, Color *fill) {
 ImageToPOT(image, *fill);
};


_Bool __sn_wrap_raylib_IsAudioStreamPlaying(AudioStream *stream) {
 return IsAudioStreamPlaying(*stream);
};


_Bool __sn_wrap_raylib_IsAudioStreamProcessed(AudioStream *stream) {
 return IsAudioStreamProcessed(*stream);
};


_Bool __sn_wrap_raylib_IsAudioStreamValid(AudioStream *stream) {
 return IsAudioStreamValid(*stream);
};


_Bool __sn_wrap_raylib_IsFontValid(Font *font) {
 return IsFontValid(*font);
};


_Bool __sn_wrap_raylib_IsImageValid(Image *image) {
 return IsImageValid(*image);
};


_Bool __sn_wrap_raylib_IsMaterialValid(Material *material) {
 return IsMaterialValid(*material);
};


_Bool __sn_wrap_raylib_IsModelAnimationValid(Model *model, ModelAnimation *anim) {
 return IsModelAnimationValid(*model, *anim);
};


_Bool __sn_wrap_raylib_IsModelValid(Model *model) {
 return IsModelValid(*model);
};


_Bool __sn_wrap_raylib_IsMusicStreamPlaying(Music *music) {
 return IsMusicStreamPlaying(*music);
};


_Bool __sn_wrap_raylib_IsMusicValid(Music *music) {
 return IsMusicValid(*music);
};


_Bool __sn_wrap_raylib_IsRenderTextureValid(RenderTexture2D *target) {
 return IsRenderTextureValid(*target);
};


_Bool __sn_wrap_raylib_IsShaderValid(Shader *shader) {
 return IsShaderValid(*shader);
};


_Bool __sn_wrap_raylib_IsSoundPlaying(Sound *sound) {
 return IsSoundPlaying(*sound);
};


_Bool __sn_wrap_raylib_IsSoundValid(Sound *sound) {
 return IsSoundValid(*sound);
};


_Bool __sn_wrap_raylib_IsTextureValid(Texture2D *texture) {
 return IsTextureValid(*texture);
};


_Bool __sn_wrap_raylib_IsWaveValid(Wave *wave) {
 return IsWaveValid(*wave);
};


void __sn_wrap_raylib_LoadAudioStream(unsigned int sampleRate, unsigned int sampleSize, unsigned int channels, AudioStream *____return) {
  AudioStream ____ret = LoadAudioStream(sampleRate, sampleSize, channels);
  memcpy(____return, &____ret, sizeof(AudioStream));
}


void __sn_wrap_raylib_LoadAutomationEventList(const char * fileName, AutomationEventList *____return) {
  AutomationEventList ____ret = LoadAutomationEventList(fileName);
  memcpy(____return, &____ret, sizeof(AutomationEventList));
}


void __sn_wrap_raylib_LoadDirectoryFiles(const char * dirPath, FilePathList *____return) {
  FilePathList ____ret = LoadDirectoryFiles(dirPath);
  memcpy(____return, &____ret, sizeof(FilePathList));
}


void __sn_wrap_raylib_LoadDirectoryFilesEx(const char * basePath, const char * filter, _Bool scanSubdirs, FilePathList *____return) {
  FilePathList ____ret = LoadDirectoryFilesEx(basePath, filter, scanSubdirs);
  memcpy(____return, &____ret, sizeof(FilePathList));
}


void __sn_wrap_raylib_LoadDroppedFiles(FilePathList *____return) {
  FilePathList ____ret = LoadDroppedFiles();
  memcpy(____return, &____ret, sizeof(FilePathList));
}


void __sn_wrap_raylib_LoadFont(const char * fileName, Font *____return) {
  Font ____ret = LoadFont(fileName);
  memcpy(____return, &____ret, sizeof(Font));
}


void __sn_wrap_raylib_LoadFontEx(const char * fileName, int fontSize, int * codepoints, int codepointCount, Font *____return) {
  Font ____ret = LoadFontEx(fileName, fontSize, codepoints, codepointCount);
  memcpy(____return, &____ret, sizeof(Font));
}


void __sn_wrap_raylib_LoadFontFromImage(Image *image, Color *key, int firstChar, Font *____return) {
  Font ____ret = LoadFontFromImage(*image, *key, firstChar);
  memcpy(____return, &____ret, sizeof(Font));
}


void __sn_wrap_raylib_LoadFontFromMemory(const char * fileType, const unsigned char * fileData, int dataSize, int fontSize, int * codepoints, int codepointCount, Font *____return) {
  Font ____ret = LoadFontFromMemory(fileType, fileData, dataSize, fontSize, codepoints, codepointCount);
  memcpy(____return, &____ret, sizeof(Font));
}


void __sn_wrap_raylib_LoadImage(const char * fileName, Image *____return) {
  Image ____ret = LoadImage(fileName);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_LoadImageAnim(const char * fileName, int * frames, Image *____return) {
  Image ____ret = LoadImageAnim(fileName, frames);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_LoadImageAnimFromMemory(const char * fileType, const unsigned char * fileData, int dataSize, int * frames, Image *____return) {
  Image ____ret = LoadImageAnimFromMemory(fileType, fileData, dataSize, frames);
  memcpy(____return, &____ret, sizeof(Image));
}


Color * __sn_wrap_raylib_LoadImageColors(Image *image) {
 return LoadImageColors(*image);
};


void __sn_wrap_raylib_LoadImageFromMemory(const char * fileType, const unsigned char * fileData, int dataSize, Image *____return) {
  Image ____ret = LoadImageFromMemory(fileType, fileData, dataSize);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_LoadImageFromScreen(Image *____return) {
  Image ____ret = LoadImageFromScreen();
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_LoadImageFromTexture(Texture2D *texture, Image *____return) {
  Image ____ret = LoadImageFromTexture(*texture);
  memcpy(____return, &____ret, sizeof(Image));
}


Color * __sn_wrap_raylib_LoadImagePalette(Image *image, int maxPaletteSize, int * colorCount) {
 return LoadImagePalette(*image, maxPaletteSize, colorCount);
};


void __sn_wrap_raylib_LoadImageRaw(const char * fileName, int width, int height, int format, int headerSize, Image *____return) {
  Image ____ret = LoadImageRaw(fileName, width, height, format, headerSize);
  memcpy(____return, &____ret, sizeof(Image));
}


void __sn_wrap_raylib_LoadMaterialDefault(Material *____return) {
  Material ____ret = LoadMaterialDefault();
  memcpy(____return, &____ret, sizeof(Material));
}


void __sn_wrap_raylib_LoadModel(const char * fileName, Model *____return) {
  Model ____ret = LoadModel(fileName);
  memcpy(____return, &____ret, sizeof(Model));
}


void __sn_wrap_raylib_LoadModelFromMesh(Mesh *mesh, Model *____return) {
  Model ____ret = LoadModelFromMesh(*mesh);
  memcpy(____return, &____ret, sizeof(Model));
}


void __sn_wrap_raylib_LoadMusicStream(const char * fileName, Music *____return) {
  Music ____ret = LoadMusicStream(fileName);
  memcpy(____return, &____ret, sizeof(Music));
}


void __sn_wrap_raylib_LoadMusicStreamFromMemory(const char * fileType, const unsigned char * data, int dataSize, Music *____return) {
  Music ____ret = LoadMusicStreamFromMemory(fileType, data, dataSize);
  memcpy(____return, &____ret, sizeof(Music));
}


void __sn_wrap_raylib_LoadRenderTexture(int width, int height, RenderTexture2D *____return) {
  RenderTexture2D ____ret = LoadRenderTexture(width, height);
  memcpy(____return, &____ret, sizeof(RenderTexture2D));
}


void __sn_wrap_raylib_LoadShader(const char * vsFileName, const char * fsFileName, Shader *____return) {
  Shader ____ret = LoadShader(vsFileName, fsFileName);
  memcpy(____return, &____ret, sizeof(Shader));
}


void __sn_wrap_raylib_LoadShaderFromMemory(const char * vsCode, const char * fsCode, Shader *____return) {
  Shader ____ret = LoadShaderFromMemory(vsCode, fsCode);
  memcpy(____return, &____ret, sizeof(Shader));
}


void __sn_wrap_raylib_LoadSound(const char * fileName, Sound *____return) {
  Sound ____ret = LoadSound(fileName);
  memcpy(____return, &____ret, sizeof(Sound));
}


void __sn_wrap_raylib_LoadSoundAlias(Sound *source, Sound *____return) {
  Sound ____ret = LoadSoundAlias(*source);
  memcpy(____return, &____ret, sizeof(Sound));
}


void __sn_wrap_raylib_LoadSoundFromWave(Wave *wave, Sound *____return) {
  Sound ____ret = LoadSoundFromWave(*wave);
  memcpy(____return, &____ret, sizeof(Sound));
}


void __sn_wrap_raylib_LoadTexture(const char * fileName, Texture2D *____return) {
  Texture2D ____ret = LoadTexture(fileName);
  memcpy(____return, &____ret, sizeof(Texture2D));
}


void __sn_wrap_raylib_LoadTextureCubemap(Image *image, int layout, TextureCubemap *____return) {
  TextureCubemap ____ret = LoadTextureCubemap(*image, layout);
  memcpy(____return, &____ret, sizeof(TextureCubemap));
}


void __sn_wrap_raylib_LoadTextureFromImage(Image *image, Texture2D *____return) {
  Texture2D ____ret = LoadTextureFromImage(*image);
  memcpy(____return, &____ret, sizeof(Texture2D));
}


void __sn_wrap_raylib_LoadVrStereoConfig(VrDeviceInfo *device, VrStereoConfig *____return) {
  VrStereoConfig ____ret = LoadVrStereoConfig(*device);
  memcpy(____return, &____ret, sizeof(VrStereoConfig));
}


void __sn_wrap_raylib_LoadWave(const char * fileName, Wave *____return) {
  Wave ____ret = LoadWave(fileName);
  memcpy(____return, &____ret, sizeof(Wave));
}


void __sn_wrap_raylib_LoadWaveFromMemory(const char * fileType, const unsigned char * fileData, int dataSize, Wave *____return) {
  Wave ____ret = LoadWaveFromMemory(fileType, fileData, dataSize);
  memcpy(____return, &____ret, sizeof(Wave));
}


float * __sn_wrap_raylib_LoadWaveSamples(Wave *wave) {
 return LoadWaveSamples(*wave);
};


void __sn_wrap_raylib_MatrixAdd(Matrix *left, Matrix *right, Matrix *____return) {
  Matrix ____ret = MatrixAdd(*left, *right);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixDecompose(Matrix *mat, Vector3 * translation, Quaternion * rotation, Vector3 * scale) {
 MatrixDecompose(*mat, translation, rotation, scale);
};


float __sn_wrap_raylib_MatrixDeterminant(Matrix *mat) {
 return MatrixDeterminant(*mat);
};


void __sn_wrap_raylib_MatrixFrustum(double left, double right, double bottom, double top, double nearPlane, double farPlane, Matrix *____return) {
  Matrix ____ret = MatrixFrustum(left, right, bottom, top, nearPlane, farPlane);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixIdentity(Matrix *____return) {
  Matrix ____ret = MatrixIdentity();
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixInvert(Matrix *mat, Matrix *____return) {
  Matrix ____ret = MatrixInvert(*mat);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixLookAt(Vector3 *eye, Vector3 *target, Vector3 *up, Matrix *____return) {
  Matrix ____ret = MatrixLookAt(*eye, *target, *up);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixMultiply(Matrix *left, Matrix *right, Matrix *____return) {
  Matrix ____ret = MatrixMultiply(*left, *right);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixOrtho(double left, double right, double bottom, double top, double nearPlane, double farPlane, Matrix *____return) {
  Matrix ____ret = MatrixOrtho(left, right, bottom, top, nearPlane, farPlane);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixPerspective(double fovY, double aspect, double nearPlane, double farPlane, Matrix *____return) {
  Matrix ____ret = MatrixPerspective(fovY, aspect, nearPlane, farPlane);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixRotate(Vector3 *axis, float angle, Matrix *____return) {
  Matrix ____ret = MatrixRotate(*axis, angle);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixRotateX(float angle, Matrix *____return) {
  Matrix ____ret = MatrixRotateX(angle);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixRotateXYZ(Vector3 *angle, Matrix *____return) {
  Matrix ____ret = MatrixRotateXYZ(*angle);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixRotateY(float angle, Matrix *____return) {
  Matrix ____ret = MatrixRotateY(angle);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixRotateZ(float angle, Matrix *____return) {
  Matrix ____ret = MatrixRotateZ(angle);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixRotateZYX(Vector3 *angle, Matrix *____return) {
  Matrix ____ret = MatrixRotateZYX(*angle);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixScale(float x, float y, float z, Matrix *____return) {
  Matrix ____ret = MatrixScale(x, y, z);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixSubtract(Matrix *left, Matrix *right, Matrix *____return) {
  Matrix ____ret = MatrixSubtract(*left, *right);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixToFloatV(Matrix *mat, float16 *____return) {
  float16 ____ret = MatrixToFloatV(*mat);
  memcpy(____return, &____ret, sizeof(float16));
}


float __sn_wrap_raylib_MatrixTrace(Matrix *mat) {
 return MatrixTrace(*mat);
};


void __sn_wrap_raylib_MatrixTranslate(float x, float y, float z, Matrix *____return) {
  Matrix ____ret = MatrixTranslate(x, y, z);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MatrixTranspose(Matrix *mat, Matrix *____return) {
  Matrix ____ret = MatrixTranspose(*mat);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_MeasureTextEx(Font *font, const char * text, float fontSize, float spacing, Vector2 *____return) {
  Vector2 ____ret = MeasureTextEx(*font, text, fontSize, spacing);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_PauseAudioStream(AudioStream *stream) {
 PauseAudioStream(*stream);
};


void __sn_wrap_raylib_PauseMusicStream(Music *music) {
 PauseMusicStream(*music);
};


void __sn_wrap_raylib_PauseSound(Sound *sound) {
 PauseSound(*sound);
};


void __sn_wrap_raylib_PlayAudioStream(AudioStream *stream) {
 PlayAudioStream(*stream);
};


void __sn_wrap_raylib_PlayAutomationEvent(AutomationEvent *event) {
 PlayAutomationEvent(*event);
};


void __sn_wrap_raylib_PlayMusicStream(Music *music) {
 PlayMusicStream(*music);
};


void __sn_wrap_raylib_PlaySound(Sound *sound) {
 PlaySound(*sound);
};


void __sn_wrap_raylib_QuaternionAdd(Quaternion *q1, Quaternion *q2, Quaternion *____return) {
  Quaternion ____ret = QuaternionAdd(*q1, *q2);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionAddValue(Quaternion *q, float add, Quaternion *____return) {
  Quaternion ____ret = QuaternionAddValue(*q, add);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionCubicHermiteSpline(Quaternion *q1, Quaternion *outTangent1, Quaternion *q2, Quaternion *inTangent2, float t, Quaternion *____return) {
  Quaternion ____ret = QuaternionCubicHermiteSpline(*q1, *outTangent1, *q2, *inTangent2, t);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionDivide(Quaternion *q1, Quaternion *q2, Quaternion *____return) {
  Quaternion ____ret = QuaternionDivide(*q1, *q2);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


int __sn_wrap_raylib_QuaternionEquals(Quaternion *p, Quaternion *q) {
 return QuaternionEquals(*p, *q);
};


void __sn_wrap_raylib_QuaternionFromAxisAngle(Vector3 *axis, float angle, Quaternion *____return) {
  Quaternion ____ret = QuaternionFromAxisAngle(*axis, angle);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionFromEuler(float pitch, float yaw, float roll, Quaternion *____return) {
  Quaternion ____ret = QuaternionFromEuler(pitch, yaw, roll);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionFromMatrix(Matrix *mat, Quaternion *____return) {
  Quaternion ____ret = QuaternionFromMatrix(*mat);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionFromVector3ToVector3(Vector3 *from, Vector3 *to, Quaternion *____return) {
  Quaternion ____ret = QuaternionFromVector3ToVector3(*from, *to);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionIdentity(Quaternion *____return) {
  Quaternion ____ret = QuaternionIdentity();
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionInvert(Quaternion *q, Quaternion *____return) {
  Quaternion ____ret = QuaternionInvert(*q);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


float __sn_wrap_raylib_QuaternionLength(Quaternion *q) {
 return QuaternionLength(*q);
};


void __sn_wrap_raylib_QuaternionLerp(Quaternion *q1, Quaternion *q2, float amount, Quaternion *____return) {
  Quaternion ____ret = QuaternionLerp(*q1, *q2, amount);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionMultiply(Quaternion *q1, Quaternion *q2, Quaternion *____return) {
  Quaternion ____ret = QuaternionMultiply(*q1, *q2);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionNlerp(Quaternion *q1, Quaternion *q2, float amount, Quaternion *____return) {
  Quaternion ____ret = QuaternionNlerp(*q1, *q2, amount);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionNormalize(Quaternion *q, Quaternion *____return) {
  Quaternion ____ret = QuaternionNormalize(*q);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionScale(Quaternion *q, float mul, Quaternion *____return) {
  Quaternion ____ret = QuaternionScale(*q, mul);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionSlerp(Quaternion *q1, Quaternion *q2, float amount, Quaternion *____return) {
  Quaternion ____ret = QuaternionSlerp(*q1, *q2, amount);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionSubtract(Quaternion *q1, Quaternion *q2, Quaternion *____return) {
  Quaternion ____ret = QuaternionSubtract(*q1, *q2);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionSubtractValue(Quaternion *q, float sub, Quaternion *____return) {
  Quaternion ____ret = QuaternionSubtractValue(*q, sub);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_QuaternionToAxisAngle(Quaternion *q, Vector3 * outAxis, float * outAngle) {
 QuaternionToAxisAngle(*q, outAxis, outAngle);
};


void __sn_wrap_raylib_QuaternionToEuler(Quaternion *q, Vector3 *____return) {
  Vector3 ____ret = QuaternionToEuler(*q);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_QuaternionToMatrix(Quaternion *q, Matrix *____return) {
  Matrix ____ret = QuaternionToMatrix(*q);
  memcpy(____return, &____ret, sizeof(Matrix));
}


void __sn_wrap_raylib_QuaternionTransform(Quaternion *q, Matrix *mat, Quaternion *____return) {
  Quaternion ____ret = QuaternionTransform(*q, *mat);
  memcpy(____return, &____ret, sizeof(Quaternion));
}


void __sn_wrap_raylib_ResumeAudioStream(AudioStream *stream) {
 ResumeAudioStream(*stream);
};


void __sn_wrap_raylib_ResumeMusicStream(Music *music) {
 ResumeMusicStream(*music);
};


void __sn_wrap_raylib_ResumeSound(Sound *sound) {
 ResumeSound(*sound);
};


void __sn_wrap_raylib_SeekMusicStream(Music *music, float position) {
 SeekMusicStream(*music, position);
};


void __sn_wrap_raylib_SetAudioStreamCallback(AudioStream *stream, AudioCallback callback) {
 SetAudioStreamCallback(*stream, callback);
};


void __sn_wrap_raylib_SetAudioStreamPan(AudioStream *stream, float pan) {
 SetAudioStreamPan(*stream, pan);
};


void __sn_wrap_raylib_SetAudioStreamPitch(AudioStream *stream, float pitch) {
 SetAudioStreamPitch(*stream, pitch);
};


void __sn_wrap_raylib_SetAudioStreamVolume(AudioStream *stream, float volume) {
 SetAudioStreamVolume(*stream, volume);
};


void __sn_wrap_raylib_SetMaterialTexture(Material * material, int mapType, Texture2D *texture) {
 SetMaterialTexture(material, mapType, *texture);
};


void __sn_wrap_raylib_SetMusicPan(Music *music, float pan) {
 SetMusicPan(*music, pan);
};


void __sn_wrap_raylib_SetMusicPitch(Music *music, float pitch) {
 SetMusicPitch(*music, pitch);
};


void __sn_wrap_raylib_SetMusicVolume(Music *music, float volume) {
 SetMusicVolume(*music, volume);
};


void __sn_wrap_raylib_SetPixelColor(void * dstPtr, Color *color, int format) {
 SetPixelColor(dstPtr, *color, format);
};


void __sn_wrap_raylib_SetShaderValue(Shader *shader, int locIndex, const void * value, int uniformType) {
 SetShaderValue(*shader, locIndex, value, uniformType);
};


void __sn_wrap_raylib_SetShaderValueMatrix(Shader *shader, int locIndex, Matrix *mat) {
 SetShaderValueMatrix(*shader, locIndex, *mat);
};


void __sn_wrap_raylib_SetShaderValueTexture(Shader *shader, int locIndex, Texture2D *texture) {
 SetShaderValueTexture(*shader, locIndex, *texture);
};


void __sn_wrap_raylib_SetShaderValueV(Shader *shader, int locIndex, const void * value, int uniformType, int count) {
 SetShaderValueV(*shader, locIndex, value, uniformType, count);
};


void __sn_wrap_raylib_SetShapesTexture(Texture2D *texture, Rectangle *source) {
 SetShapesTexture(*texture, *source);
};


void __sn_wrap_raylib_SetSoundPan(Sound *sound, float pan) {
 SetSoundPan(*sound, pan);
};


void __sn_wrap_raylib_SetSoundPitch(Sound *sound, float pitch) {
 SetSoundPitch(*sound, pitch);
};


void __sn_wrap_raylib_SetSoundVolume(Sound *sound, float volume) {
 SetSoundVolume(*sound, volume);
};


void __sn_wrap_raylib_SetTextureFilter(Texture2D *texture, int filter) {
 SetTextureFilter(*texture, filter);
};


void __sn_wrap_raylib_SetTextureWrap(Texture2D *texture, int wrap) {
 SetTextureWrap(*texture, wrap);
};


void __sn_wrap_raylib_SetWindowIcon(Image *image) {
 SetWindowIcon(*image);
};


void __sn_wrap_raylib_StopAudioStream(AudioStream *stream) {
 StopAudioStream(*stream);
};


void __sn_wrap_raylib_StopMusicStream(Music *music) {
 StopMusicStream(*music);
};


void __sn_wrap_raylib_StopSound(Sound *sound) {
 StopSound(*sound);
};


void __sn_wrap_raylib_UnloadAudioStream(AudioStream *stream) {
 UnloadAudioStream(*stream);
};


void __sn_wrap_raylib_UnloadAutomationEventList(AutomationEventList *list) {
 UnloadAutomationEventList(*list);
};


void __sn_wrap_raylib_UnloadDirectoryFiles(FilePathList *files) {
 UnloadDirectoryFiles(*files);
};


void __sn_wrap_raylib_UnloadDroppedFiles(FilePathList *files) {
 UnloadDroppedFiles(*files);
};


void __sn_wrap_raylib_UnloadFont(Font *font) {
 UnloadFont(*font);
};


void __sn_wrap_raylib_UnloadImage(Image *image) {
 UnloadImage(*image);
};


void __sn_wrap_raylib_UnloadMaterial(Material *material) {
 UnloadMaterial(*material);
};


void __sn_wrap_raylib_UnloadMesh(Mesh *mesh) {
 UnloadMesh(*mesh);
};


void __sn_wrap_raylib_UnloadModel(Model *model) {
 UnloadModel(*model);
};


void __sn_wrap_raylib_UnloadModelAnimation(ModelAnimation *anim) {
 UnloadModelAnimation(*anim);
};


void __sn_wrap_raylib_UnloadMusicStream(Music *music) {
 UnloadMusicStream(*music);
};


void __sn_wrap_raylib_UnloadRenderTexture(RenderTexture2D *target) {
 UnloadRenderTexture(*target);
};


void __sn_wrap_raylib_UnloadShader(Shader *shader) {
 UnloadShader(*shader);
};


void __sn_wrap_raylib_UnloadSound(Sound *sound) {
 UnloadSound(*sound);
};


void __sn_wrap_raylib_UnloadSoundAlias(Sound *alias) {
 UnloadSoundAlias(*alias);
};


void __sn_wrap_raylib_UnloadTexture(Texture2D *texture) {
 UnloadTexture(*texture);
};


void __sn_wrap_raylib_UnloadVrStereoConfig(VrStereoConfig *config) {
 UnloadVrStereoConfig(*config);
};


void __sn_wrap_raylib_UnloadWave(Wave *wave) {
 UnloadWave(*wave);
};


void __sn_wrap_raylib_UpdateAudioStream(AudioStream *stream, const void * data, int frameCount) {
 UpdateAudioStream(*stream, data, frameCount);
};


void __sn_wrap_raylib_UpdateCameraPro(Camera * camera, Vector3 *movement, Vector3 *rotation, float zoom) {
 UpdateCameraPro(camera, *movement, *rotation, zoom);
};


void __sn_wrap_raylib_UpdateMeshBuffer(Mesh *mesh, int index, const void * data, int dataSize, int offset) {
 UpdateMeshBuffer(*mesh, index, data, dataSize, offset);
};


void __sn_wrap_raylib_UpdateModelAnimation(Model *model, ModelAnimation *anim, int frame) {
 UpdateModelAnimation(*model, *anim, frame);
};


void __sn_wrap_raylib_UpdateModelAnimationBones(Model *model, ModelAnimation *anim, int frame) {
 UpdateModelAnimationBones(*model, *anim, frame);
};


void __sn_wrap_raylib_UpdateMusicStream(Music *music) {
 UpdateMusicStream(*music);
};


void __sn_wrap_raylib_UpdateSound(Sound *sound, const void * data, int sampleCount) {
 UpdateSound(*sound, data, sampleCount);
};


void __sn_wrap_raylib_UpdateTexture(Texture2D *texture, const void * pixels) {
 UpdateTexture(*texture, pixels);
};


void __sn_wrap_raylib_UpdateTextureRec(Texture2D *texture, Rectangle *rec, const void * pixels) {
 UpdateTextureRec(*texture, *rec, pixels);
};


void __sn_wrap_raylib_Vector2Add(Vector2 *v1, Vector2 *v2, Vector2 *____return) {
  Vector2 ____ret = Vector2Add(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2AddValue(Vector2 *v, float add, Vector2 *____return) {
  Vector2 ____ret = Vector2AddValue(*v, add);
  memcpy(____return, &____ret, sizeof(Vector2));
}


float __sn_wrap_raylib_Vector2Angle(Vector2 *v1, Vector2 *v2) {
 return Vector2Angle(*v1, *v2);
};


void __sn_wrap_raylib_Vector2Clamp(Vector2 *v, Vector2 *min, Vector2 *max, Vector2 *____return) {
  Vector2 ____ret = Vector2Clamp(*v, *min, *max);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2ClampValue(Vector2 *v, float min, float max, Vector2 *____return) {
  Vector2 ____ret = Vector2ClampValue(*v, min, max);
  memcpy(____return, &____ret, sizeof(Vector2));
}


float __sn_wrap_raylib_Vector2Distance(Vector2 *v1, Vector2 *v2) {
 return Vector2Distance(*v1, *v2);
};


float __sn_wrap_raylib_Vector2DistanceSqr(Vector2 *v1, Vector2 *v2) {
 return Vector2DistanceSqr(*v1, *v2);
};


void __sn_wrap_raylib_Vector2Divide(Vector2 *v1, Vector2 *v2, Vector2 *____return) {
  Vector2 ____ret = Vector2Divide(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector2));
}


float __sn_wrap_raylib_Vector2DotProduct(Vector2 *v1, Vector2 *v2) {
 return Vector2DotProduct(*v1, *v2);
};


int __sn_wrap_raylib_Vector2Equals(Vector2 *p, Vector2 *q) {
 return Vector2Equals(*p, *q);
};


void __sn_wrap_raylib_Vector2Invert(Vector2 *v, Vector2 *____return) {
  Vector2 ____ret = Vector2Invert(*v);
  memcpy(____return, &____ret, sizeof(Vector2));
}


float __sn_wrap_raylib_Vector2Length(Vector2 *v) {
 return Vector2Length(*v);
};


float __sn_wrap_raylib_Vector2LengthSqr(Vector2 *v) {
 return Vector2LengthSqr(*v);
};


void __sn_wrap_raylib_Vector2Lerp(Vector2 *v1, Vector2 *v2, float amount, Vector2 *____return) {
  Vector2 ____ret = Vector2Lerp(*v1, *v2, amount);
  memcpy(____return, &____ret, sizeof(Vector2));
}


float __sn_wrap_raylib_Vector2LineAngle(Vector2 *start, Vector2 *end) {
 return Vector2LineAngle(*start, *end);
};


void __sn_wrap_raylib_Vector2Max(Vector2 *v1, Vector2 *v2, Vector2 *____return) {
  Vector2 ____ret = Vector2Max(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Min(Vector2 *v1, Vector2 *v2, Vector2 *____return) {
  Vector2 ____ret = Vector2Min(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2MoveTowards(Vector2 *v, Vector2 *target, float maxDistance, Vector2 *____return) {
  Vector2 ____ret = Vector2MoveTowards(*v, *target, maxDistance);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Multiply(Vector2 *v1, Vector2 *v2, Vector2 *____return) {
  Vector2 ____ret = Vector2Multiply(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Negate(Vector2 *v, Vector2 *____return) {
  Vector2 ____ret = Vector2Negate(*v);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Normalize(Vector2 *v, Vector2 *____return) {
  Vector2 ____ret = Vector2Normalize(*v);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2One(Vector2 *____return) {
  Vector2 ____ret = Vector2One();
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Reflect(Vector2 *v, Vector2 *normal, Vector2 *____return) {
  Vector2 ____ret = Vector2Reflect(*v, *normal);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Refract(Vector2 *v, Vector2 *n, float r, Vector2 *____return) {
  Vector2 ____ret = Vector2Refract(*v, *n, r);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Rotate(Vector2 *v, float angle, Vector2 *____return) {
  Vector2 ____ret = Vector2Rotate(*v, angle);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Scale(Vector2 *v, float scale, Vector2 *____return) {
  Vector2 ____ret = Vector2Scale(*v, scale);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Subtract(Vector2 *v1, Vector2 *v2, Vector2 *____return) {
  Vector2 ____ret = Vector2Subtract(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2SubtractValue(Vector2 *v, float sub, Vector2 *____return) {
  Vector2 ____ret = Vector2SubtractValue(*v, sub);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Transform(Vector2 *v, Matrix *mat, Vector2 *____return) {
  Vector2 ____ret = Vector2Transform(*v, *mat);
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector2Zero(Vector2 *____return) {
  Vector2 ____ret = Vector2Zero();
  memcpy(____return, &____ret, sizeof(Vector2));
}


void __sn_wrap_raylib_Vector3Add(Vector3 *v1, Vector3 *v2, Vector3 *____return) {
  Vector3 ____ret = Vector3Add(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3AddValue(Vector3 *v, float add, Vector3 *____return) {
  Vector3 ____ret = Vector3AddValue(*v, add);
  memcpy(____return, &____ret, sizeof(Vector3));
}


float __sn_wrap_raylib_Vector3Angle(Vector3 *v1, Vector3 *v2) {
 return Vector3Angle(*v1, *v2);
};


void __sn_wrap_raylib_Vector3Barycenter(Vector3 *p, Vector3 *a, Vector3 *b, Vector3 *c, Vector3 *____return) {
  Vector3 ____ret = Vector3Barycenter(*p, *a, *b, *c);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Clamp(Vector3 *v, Vector3 *min, Vector3 *max, Vector3 *____return) {
  Vector3 ____ret = Vector3Clamp(*v, *min, *max);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3ClampValue(Vector3 *v, float min, float max, Vector3 *____return) {
  Vector3 ____ret = Vector3ClampValue(*v, min, max);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3CrossProduct(Vector3 *v1, Vector3 *v2, Vector3 *____return) {
  Vector3 ____ret = Vector3CrossProduct(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3CubicHermite(Vector3 *v1, Vector3 *tangent1, Vector3 *v2, Vector3 *tangent2, float amount, Vector3 *____return) {
  Vector3 ____ret = Vector3CubicHermite(*v1, *tangent1, *v2, *tangent2, amount);
  memcpy(____return, &____ret, sizeof(Vector3));
}


float __sn_wrap_raylib_Vector3Distance(Vector3 *v1, Vector3 *v2) {
 return Vector3Distance(*v1, *v2);
};


float __sn_wrap_raylib_Vector3DistanceSqr(Vector3 *v1, Vector3 *v2) {
 return Vector3DistanceSqr(*v1, *v2);
};


void __sn_wrap_raylib_Vector3Divide(Vector3 *v1, Vector3 *v2, Vector3 *____return) {
  Vector3 ____ret = Vector3Divide(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector3));
}


float __sn_wrap_raylib_Vector3DotProduct(Vector3 *v1, Vector3 *v2) {
 return Vector3DotProduct(*v1, *v2);
};


int __sn_wrap_raylib_Vector3Equals(Vector3 *p, Vector3 *q) {
 return Vector3Equals(*p, *q);
};


void __sn_wrap_raylib_Vector3Invert(Vector3 *v, Vector3 *____return) {
  Vector3 ____ret = Vector3Invert(*v);
  memcpy(____return, &____ret, sizeof(Vector3));
}


float __sn_wrap_raylib_Vector3Length(const Vector3 *v) {
 return Vector3Length(*v);
};


float __sn_wrap_raylib_Vector3LengthSqr(const Vector3 *v) {
 return Vector3LengthSqr(*v);
};


void __sn_wrap_raylib_Vector3Lerp(Vector3 *v1, Vector3 *v2, float amount, Vector3 *____return) {
  Vector3 ____ret = Vector3Lerp(*v1, *v2, amount);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Max(Vector3 *v1, Vector3 *v2, Vector3 *____return) {
  Vector3 ____ret = Vector3Max(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Min(Vector3 *v1, Vector3 *v2, Vector3 *____return) {
  Vector3 ____ret = Vector3Min(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3MoveTowards(Vector3 *v, Vector3 *target, float maxDistance, Vector3 *____return) {
  Vector3 ____ret = Vector3MoveTowards(*v, *target, maxDistance);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Multiply(Vector3 *v1, Vector3 *v2, Vector3 *____return) {
  Vector3 ____ret = Vector3Multiply(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Negate(Vector3 *v, Vector3 *____return) {
  Vector3 ____ret = Vector3Negate(*v);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Normalize(Vector3 *v, Vector3 *____return) {
  Vector3 ____ret = Vector3Normalize(*v);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3One(Vector3 *____return) {
  Vector3 ____ret = Vector3One();
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Perpendicular(Vector3 *v, Vector3 *____return) {
  Vector3 ____ret = Vector3Perpendicular(*v);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Project(Vector3 *v1, Vector3 *v2, Vector3 *____return) {
  Vector3 ____ret = Vector3Project(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Reflect(Vector3 *v, Vector3 *normal, Vector3 *____return) {
  Vector3 ____ret = Vector3Reflect(*v, *normal);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Refract(Vector3 *v, Vector3 *n, float r, Vector3 *____return) {
  Vector3 ____ret = Vector3Refract(*v, *n, r);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Reject(Vector3 *v1, Vector3 *v2, Vector3 *____return) {
  Vector3 ____ret = Vector3Reject(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3RotateByAxisAngle(Vector3 *v, Vector3 *axis, float angle, Vector3 *____return) {
  Vector3 ____ret = Vector3RotateByAxisAngle(*v, *axis, angle);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3RotateByQuaternion(Vector3 *v, Quaternion *q, Vector3 *____return) {
  Vector3 ____ret = Vector3RotateByQuaternion(*v, *q);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Scale(Vector3 *v, float scalar, Vector3 *____return) {
  Vector3 ____ret = Vector3Scale(*v, scalar);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Subtract(Vector3 *v1, Vector3 *v2, Vector3 *____return) {
  Vector3 ____ret = Vector3Subtract(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3SubtractValue(Vector3 *v, float sub, Vector3 *____return) {
  Vector3 ____ret = Vector3SubtractValue(*v, sub);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3ToFloatV(Vector3 *v, float3 *____return) {
  float3 ____ret = Vector3ToFloatV(*v);
  memcpy(____return, &____ret, sizeof(float3));
}


void __sn_wrap_raylib_Vector3Transform(Vector3 *v, Matrix *mat, Vector3 *____return) {
  Vector3 ____ret = Vector3Transform(*v, *mat);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Unproject(Vector3 *source, Matrix *projection, Matrix *view, Vector3 *____return) {
  Vector3 ____ret = Vector3Unproject(*source, *projection, *view);
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector3Zero(Vector3 *____return) {
  Vector3 ____ret = Vector3Zero();
  memcpy(____return, &____ret, sizeof(Vector3));
}


void __sn_wrap_raylib_Vector4Add(Vector4 *v1, Vector4 *v2, Vector4 *____return) {
  Vector4 ____ret = Vector4Add(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4AddValue(Vector4 *v, float add, Vector4 *____return) {
  Vector4 ____ret = Vector4AddValue(*v, add);
  memcpy(____return, &____ret, sizeof(Vector4));
}


float __sn_wrap_raylib_Vector4Distance(Vector4 *v1, Vector4 *v2) {
 return Vector4Distance(*v1, *v2);
};


float __sn_wrap_raylib_Vector4DistanceSqr(Vector4 *v1, Vector4 *v2) {
 return Vector4DistanceSqr(*v1, *v2);
};


void __sn_wrap_raylib_Vector4Divide(Vector4 *v1, Vector4 *v2, Vector4 *____return) {
  Vector4 ____ret = Vector4Divide(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector4));
}


float __sn_wrap_raylib_Vector4DotProduct(Vector4 *v1, Vector4 *v2) {
 return Vector4DotProduct(*v1, *v2);
};


int __sn_wrap_raylib_Vector4Equals(Vector4 *p, Vector4 *q) {
 return Vector4Equals(*p, *q);
};


void __sn_wrap_raylib_Vector4Invert(Vector4 *v, Vector4 *____return) {
  Vector4 ____ret = Vector4Invert(*v);
  memcpy(____return, &____ret, sizeof(Vector4));
}


float __sn_wrap_raylib_Vector4Length(Vector4 *v) {
 return Vector4Length(*v);
};


float __sn_wrap_raylib_Vector4LengthSqr(Vector4 *v) {
 return Vector4LengthSqr(*v);
};


void __sn_wrap_raylib_Vector4Lerp(Vector4 *v1, Vector4 *v2, float amount, Vector4 *____return) {
  Vector4 ____ret = Vector4Lerp(*v1, *v2, amount);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4Max(Vector4 *v1, Vector4 *v2, Vector4 *____return) {
  Vector4 ____ret = Vector4Max(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4Min(Vector4 *v1, Vector4 *v2, Vector4 *____return) {
  Vector4 ____ret = Vector4Min(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4MoveTowards(Vector4 *v, Vector4 *target, float maxDistance, Vector4 *____return) {
  Vector4 ____ret = Vector4MoveTowards(*v, *target, maxDistance);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4Multiply(Vector4 *v1, Vector4 *v2, Vector4 *____return) {
  Vector4 ____ret = Vector4Multiply(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4Negate(Vector4 *v, Vector4 *____return) {
  Vector4 ____ret = Vector4Negate(*v);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4Normalize(Vector4 *v, Vector4 *____return) {
  Vector4 ____ret = Vector4Normalize(*v);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4One(Vector4 *____return) {
  Vector4 ____ret = Vector4One();
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4Scale(Vector4 *v, float scale, Vector4 *____return) {
  Vector4 ____ret = Vector4Scale(*v, scale);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4Subtract(Vector4 *v1, Vector4 *v2, Vector4 *____return) {
  Vector4 ____ret = Vector4Subtract(*v1, *v2);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4SubtractValue(Vector4 *v, float add, Vector4 *____return) {
  Vector4 ____ret = Vector4SubtractValue(*v, add);
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_Vector4Zero(Vector4 *____return) {
  Vector4 ____ret = Vector4Zero();
  memcpy(____return, &____ret, sizeof(Vector4));
}


void __sn_wrap_raylib_WaveCopy(Wave *wave, Wave *____return) {
  Wave ____ret = WaveCopy(*wave);
  memcpy(____return, &____ret, sizeof(Wave));
}