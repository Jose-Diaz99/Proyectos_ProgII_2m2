/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.controllers;

import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import ni.edu.uni.programacion.view.frames.FrmFacturaDemo;

/**
 *
 * @author JADPA02
 */
public class FrmFacturaController {
    
    private final FrmFacturaDemo facturaDemo;
    private DefaultTableModel prod;
    
    public FrmFacturaController(FrmFacturaDemo facturaDemo) {
        this.facturaDemo=facturaDemo;
        initComponent();
    }

    private void initComponent() {
         facturaDemo.getBtnAgregar().addActionListener(((e) -> {
                btnAgregarActionListener(e);
            }));
         facturaDemo.getBtnEliminar().addActionListener(((e) -> {
                btnEliminarActionListener(e);
            }));
    }
    
    private void btnAgregarActionListener(ActionEvent e){
        String[] array=new String[4];
        array[0]=facturaDemo.getTxtCodProd().toString();
        array[1]=facturaDemo.getTxtProducto().toString();
        array[2]=facturaDemo.getSpCant().toString();
        array[3]=facturaDemo.getFtPrecio().toString();
        
        prod= (DefaultTableModel)facturaDemo.getJtableProductos().getModel();
        prod.addRow(array);
        
    }
    private void btnEliminarActionListener(ActionEvent e){
        prod.removeRow(prod.getRowCount()-1);
    }
}
