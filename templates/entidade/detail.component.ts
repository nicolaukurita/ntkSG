import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  templateUrl: './${entidade.nameLower}-detail.component.html',
  styleUrls: ['./${entidade.nameLower}-detail.component.css']
})
export class ${entidade.nome}DetailComponent implements OnInit {
  pageTitle = '${entidade.nome} Detail';

constructor(private route: ActivatedRoute,
              private router: Router,
              private ${entidade.nameLower}Service: ${entidade.nome}Service) {
  }

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    if (id) {
      this.get${entidade.nome}(id);
    }
  }

  onBack(): void {
    this.router.navigate(['/${entidade.pluralNameLower}']);
  }
}