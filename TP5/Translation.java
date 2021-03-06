package TP5;

import org.lwjgl.opengl.GL11;
import TP4.Vecteur3D;

/**
 * La classe translation applique une translation d�finie par
 * l'attribut m_coordonnees 
 *
 * @author Tanguy CHALON
 * @version 20/03/2019
 */
public abstract class Translation extends Transformation 
{
    //ce vecteur stocke les coordonnees de translation 
    private Vecteur3D m_coordonnees; 
    /** 
     * Ce constructeur fixe les coordonn�es de translation en m�me temps qu'une r�f�rence vers l'instance de noeud parent
     * @param _parent le noeud d�clar� comme parent de l'instance courante (this)
     * @param _coordonnees les coordonn�es de translation � appliquer
     */
    public Translation(Noeud _parent, Vecteur3D _coordonnees)
    {
        super(_parent);
        m_coordonnees = _coordonnees; 
    }

    /** 
     * Impl�mentation de la m�thode abstraite transforme() d�clar�e initialement dans la classe
     * abstraite Transformation. Elle consiste � appeler l'instruction OpenGL glTranslatef
     * avec trois coordonn�es (float) 
     */
    public void transforme()
    {
        GL11.glTranslatef(m_coordonnees.getX(), m_coordonnees.getY(), m_coordonnees.getZ());
    }
}
