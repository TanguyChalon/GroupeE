package TP5;

import org.lwjgl.opengl.GL11;

/**
 * Write a description of class Cube here.
 *
 * @author Tanguy CHALON
 * @version 20/03/2019
 */
public class CubeTexture extends Objet
{
    public CubeTexture(Noeud _parent)
    {
        super(_parent);
    }

    /**
     * Cette m�thode utilise une suite d'instructions OpenGL permettant d'affihcer un cube. 
     * Vous trouverez ces instructions dans la classe OpenGL en vrac du package TP2. 
     */


    public void dessine(){
    GL11.glBegin(GL11.GL_QUADS);
        // Front Face
        //GL11.glColor3f(0.5f,0.5f,0.5f);
        GL11.glNormal3f( 0.0f, 0.0f, 1.0f);
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex3f(-1.0f, -1.0f, 1.0f); // Bottom Left Of The Texture and Quad
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex3f(1.0f, -1.0f, 1.0f); // Bottom Right Of The Texture and Quad
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex3f(1.0f, 1.0f, 1.0f); // Top Right Of The Texture and Quad
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(-1.0f, 1.0f, 1.0f); // Top Left Of The Texture and Quad
        // Back Face
        GL11.glNormal3f( 0.0f, 0.0f, -1.0f);        
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex3f(-1.0f, -1.0f, -1.0f); // Bottom Right Of The Texture and Quad
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex3f(-1.0f, 1.0f, -1.0f); // Top Right Of The Texture and Quad
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(1.0f, 1.0f, -1.0f); // Top Left Of The Texture and Quad
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex3f(1.0f, -1.0f, -1.0f); // Bottom Left Of The Texture and Quad
        // Top Face
        GL11.glNormal3f( 0.0f, 1.0f, 0.0f);        
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(-1.0f, 1.0f, -1.0f); // Top Left Of The Texture and Quad
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex3f(-1.0f, 1.0f, 1.0f); // Bottom Left Of The Texture and Quad
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex3f(1.0f, 1.0f, 1.0f); // Bottom Right Of The Texture and Quad
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex3f(1.0f, 1.0f, -1.0f); // Top Right Of The Texture and Quad
        // Bottom Face
        GL11.glNormal3f( 0.0f, -1.0f, 0.0f);
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex3f(-1.0f, -1.0f, -1.0f); // Top Right Of The Texture and Quad
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(1.0f, -1.0f, -1.0f); // Top Left Of The Texture and Quad
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex3f(1.0f, -1.0f, 1.0f); // Bottom Left Of The Texture and Quad
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex3f(-1.0f, -1.0f, 1.0f); // Bottom Right Of The Texture and Quad
        // Right face
        GL11.glNormal3f( 1.0f, 0.0f, 0.0f);        
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex3f(1.0f, -1.0f, -1.0f); // Bottom Right Of The Texture and Quad
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex3f(1.0f, 1.0f, -1.0f); // Top Right Of The Texture and Quad
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(1.0f, 1.0f, 1.0f); // Top Left Of The Texture and Quad
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex3f(1.0f, -1.0f, 1.0f); // Bottom Left Of The Texture and Quad
        // Left Face
        GL11.glNormal3f( -1.0f, 0.0f, 0.0f);        
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex3f(-1.0f, -1.0f, -1.0f); // Bottom Left Of The Texture and Quad
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex3f(-1.0f, -1.0f, 1.0f); // Bottom Right Of The Texture and Quad
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex3f(-1.0f, 1.0f, 1.0f); // Top Right Of The Texture and Quad
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex3f(-1.0f, 1.0f, -1.0f); // Top Left Of The Texture and Quad
        GL11.glEnd();
    }
}
