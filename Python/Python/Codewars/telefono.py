# https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/python

def create_phone_number(n):
  prefijo = ''
  telefono = ''
  for i in range(len(n),3):
    i = str(i)
    prefijo += i
  for i in range(3,len(n)):
    i = str(i)
    telefono += i
  

  print(prefijo)
  print(telefono)


create_phone_number([1, 2, 3, 4, 5, 6, 7, 8, 9, 0])

