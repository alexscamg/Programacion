import pandas as pd
"""Un minorista en particular tiene un 60 por ciento de descuento en una variedad de productos descontinuados.
Al minorista le gustaría ayudar a sus clientes a determinar el precio reducido de la mercancía al tener una tabla de descuentos impresa en el estante que muestre los precios originales y los precios después de que se haya aplicado el descuento. 
Escriba un programa que use un bucle para generar esta tabla, que muestre el precio original, el monto del descuento y el nuevo precio para compras de $4.95, $9.95, $14.95, $19.95 y $24.95. 
Asegúrese de que los montos de descuento y los nuevos precios se redondeen a 2 decimales cuando se muestren."""

# Declaramos la funcion
def descuento(precio):
    # Creamos una lista llamada tabla
    tabla = []
    # Mientras que el precio no sea una cadena sin valores
    while precio != '':
        # Pasamos precio a float
        precio = float(precio)
        # Declaramos el descuento
        descuento = '-60%'
        # Calculamos el descuento
        preciodes = precio * 0.60
        precio2 = precio - preciodes
        # Metemos en una lista el precio, decuento y precio descontado y lo añadimos a la lista tabla
        lista = [precio, descuento, precio2]
        tabla.append(lista)
        # Gracias a la librería pandas y la función DataFrame hacemos la tabla
        tablaprint = pd.DataFrame(tabla, columns=['Precio', 'Descuento', 'Precio descontado'])
        # Seguimos pidiendo nuevos precios
        precio = (input('Introduce un precio: '))
    # Retornamos la tabla al usuario
    return tablaprint


precio = input('Introduce un precio: ')
print(descuento(precio))
