import { Component, OnInit, ViewChild } from "@angular/core";
import { MatPaginator } from "@angular/material/paginator";
import { MatTableDataSource } from "@angular/material/table";
import { Tecnico } from "src/app/models/Tecnico";

@Component({
  selector: "app-tecnico",
  templateUrl: "./tecnico.component.html",
  styleUrls: ["./tecnico.component.css"],
})
export class TecnicoComponent implements OnInit {
  ELEMENT_DATA: Tecnico[] = [
    {
      id: 1,
      nome: 'Rodrigo Weber',
      cpf: '123.456.789-10',
      email: 'rodrgio@email.com',
      senha: '1234',
      perfis: ['0'],
      dataCriacao: '15/09/2022'
    }
  ];

  displayedColumns = ["id", "nome", "cpf", "email", "acoes"];
  dataSource = new MatTableDataSource<Tecnico>(this.ELEMENT_DATA);

  constructor() {}

  ngOnInit(): void {}

  @ViewChild(MatPaginator) paginator: MatPaginator;

  /**
   * Set the paginator after the view init since this component will
   * be able to query its view for the initialized paginator.
   */
  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
  }
}
