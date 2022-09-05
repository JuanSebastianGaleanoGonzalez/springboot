// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){
    const request = await fetch('usuarios', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const usuarios = await request.json();

    let listadoUsuarios = '';
    for(let usuario of usuarios){
        let usuarioIterador = '<tr><td>'+usuario.id_usuario+'</td><td>'+usuario.nombre+' '+usuario.apellido+'</td><td>'+usuario.email+'</td><td>'+usuario.telefono+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm">\n' + '                                                    <i class="fas fa-trash"></i>\n' + '           </a></td></tr>'
        listadoUsuarios += usuarioIterador;
    }
    document.querySelector('#usuarios tbody').outerHTML = listadoUsuarios;
    console.log(listadoUsuarios);
}
