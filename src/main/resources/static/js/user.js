$(document).ready(function() {

    cargarUsuarios();
  actualizarEmailDelUsuario();
});

function actualizarEmailDelUsuario() {
    document.getElementById('txt-email-usuario').outerHTML = localStorage.email;
}


async function cargarUsuarios() {
  const request = await fetch('turing/api/v1', {
    method: 'GET',
    headers: getHeaders()
  });
  const usuarios = await request.json();


  let listadoHtml = '';
  for (let usuario of usuarios) {
    let botonEliminar = '<a href="#" onclick="eliminarUsuario(' + usuario.iduser + ')" class="btn btn-primary"><i class="">Eliminar</i></a>';

    let country_user = usuario.country == null ? '-' : usuario.country;
    let usuarioHtml = '<tr><td>'+usuario.iduser+'</td><td>' + usuario.name + '</td><td> ' + usuario.city + '</td><td>'
                    + usuario.email+'</td><td>'+country_user
                    + '</td><td>' + botonEliminar + '</td></tr>';
    listadoHtml += usuarioHtml;
  }

document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

}

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json',
     'Authorization': localStorage.token
   };
}

async function eliminarUsuario(id) {

  if (!confirm('¿Desea eliminar este usuario?')) {
    return;
  }

 const request = await fetch('turing/api/v1/' + id, {
    method: 'DELETE',
    headers: getHeaders()
  });

  location.reload()
}